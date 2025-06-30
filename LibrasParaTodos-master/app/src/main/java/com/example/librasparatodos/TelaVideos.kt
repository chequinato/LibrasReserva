package com.example.librasparatodos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import org.json.JSONObject
import java.text.Normalizer

class TelaVideos : AppCompatActivity() {

    private lateinit var youTubePlayerView: YouTubePlayerView
    private lateinit var youTubePlayer: YouTubePlayer
    private lateinit var campoBusca: EditText
    private lateinit var iconeBusca: ImageView
    private lateinit var mapaVideos: Map<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_videos)

        // Barra de navegação
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_bar)
        bottomNavigationView.selectedItemId = R.id.videos

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, TelaCriadores::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.videos -> true
                else -> false
            }
        }

        // Referências
        campoBusca = findViewById(R.id.campo_busca)
        iconeBusca = findViewById(R.id.icone_busca)
        youTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)

        // Carrega o JSON com as palavras normalizadas
        mapaVideos = carregarVideosJson(this)

        // Inicializa o player do YouTube
        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(player: YouTubePlayer) {
                youTubePlayer = player
            }
        })

        // Busca e reproduz vídeo
        iconeBusca.setOnClickListener {
            val palavraDigitada = removerAcentos(campoBusca.text.toString())
            val videoId = mapaVideos[palavraDigitada]

            if (videoId != null) {
                youTubePlayer.loadVideo(videoId, 0f)
            } else {
                Toast.makeText(this, "Vídeo não encontrado para \"$palavraDigitada\"", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // 🔧 Função para normalizar a palavra (acentos, espaços, maiúsculas)
    private fun removerAcentos(texto: String): String {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
            .replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "")
            .lowercase()
            .trim()
    }

    // 🔧 Função para carregar JSON já com palavras normalizadas
    private fun carregarVideosJson(context: Context): Map<String, String> {
        val inputStream = context.resources.openRawResource(R.raw.videos)
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val jsonObject = JSONObject(jsonString)

        val mapa = mutableMapOf<String, String>()
        jsonObject.keys().forEach { chave ->
            val chaveNormalizada = removerAcentos(chave)
            val videoId = jsonObject.getString(chave)
            mapa[chaveNormalizada] = videoId
        }

        return mapa
    }
}

