package com.example.librasparatodos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class TelaVideos : AppCompatActivity() {

    private lateinit var youTubePlayerView: YouTubePlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_videos)

        // Configuração da barra de navegação
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_bar)

        // Define o item selecionado atual
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

        // Inicializa o YouTubePlayerView
        youTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)  // Para gerenciar ciclo de vida

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(player: YouTubePlayer) {
                val videoId = "DRYrRIqfbKE" // Coloque o ID do vídeo desejado
                player.loadVideo(videoId, 0f)
            }
        })
    }
}
