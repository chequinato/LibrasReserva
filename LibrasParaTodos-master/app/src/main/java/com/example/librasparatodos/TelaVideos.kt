package com.example.librasparatodos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.json.JSONObject
import java.text.Normalizer

class TelaVideos : AppCompatActivity() {

    private lateinit var campoBusca: EditText
    private lateinit var iconeBusca: ImageView
    private lateinit var recyclerVideos: RecyclerView
    private lateinit var mapaVideos: Map<String, String>
    private lateinit var categoriasJson: JSONObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_videos)

        // Navegação
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
        recyclerVideos = findViewById(R.id.recycler_videos)

        // Configura RecyclerView
        recyclerVideos.layoutManager = LinearLayoutManager(this)

        // Carrega JSON
        mapaVideos = carregarVideosJson(this)

        iconeBusca.setOnClickListener {
            val entrada = removerAcentos(campoBusca.text.toString())

            // Se for palavra específica
            val videoId = mapaVideos[entrada]

            if (videoId != null) {
                // Mostra apenas um vídeo numa lista
                recyclerVideos.adapter = VideoAdapter(this, listOf(videoId), lifecycle)
            } else if (categoriasJson.has(entrada)) {
                // Mostra todos vídeos da categoria
                val categoriaObj = categoriasJson.getJSONObject(entrada)
                val videoIds = mutableListOf<String>()

                categoriaObj.keys().forEach { palavra ->
                    videoIds.add(categoriaObj.getString(palavra))
                }

                if (videoIds.isNotEmpty()) {
                    recyclerVideos.adapter = VideoAdapter(this, videoIds, lifecycle)
                    Toast.makeText(this, "Exibindo vídeos da categoria \"$entrada\" (${videoIds.size})", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Categoria \"$entrada\" está vazia.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Vídeo ou categoria não encontrada: \"$entrada\"", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun removerAcentos(texto: String): String {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
            .replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "")
            .lowercase()
            .trim()
    }

    private fun carregarVideosJson(context: Context): Map<String, String> {
        val inputStream = context.resources.openRawResource(R.raw.videos)
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val jsonRaiz = JSONObject(jsonString)
        val categorias = jsonRaiz.getJSONObject("categorias")
        categoriasJson = categorias

        val mapa = mutableMapOf<String, String>()
        categorias.keys().forEach { categoria ->
            val palavras = categorias.getJSONObject(categoria)
            palavras.keys().forEach { palavra ->
                val chaveNormalizada = removerAcentos(palavra)
                val videoId = palavras.getString(palavra)
                mapa[chaveNormalizada] = videoId
            }
        }

        return mapa
    }
}
