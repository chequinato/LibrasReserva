package com.example.librasparatodos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener

class YoutubeActivity : AppCompatActivity() {

    private lateinit var youTubePlayerView: YouTubePlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        youTubePlayerView = findViewById(R.id.youtube_player_view)

        // Substitua com sua chave da API do YouTube
        val apiKey = "AIzaSyDvWAfQhUL-sRT_mQF_tplDHZo66XRaG_k"

        // Inicializando o YouTube Player
        youTubePlayerView.initialize(apiKey, object : OnInitializedListener {
            override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestored: Boolean) {
                if (!wasRestored) {
                    try {
                        // Coloque o ID do vídeo que você deseja exibir
                        player?.loadVideo("Zpdu3QaINUU", 0) // Substitua o ID com o ID do vídeo
                    } catch (e: Exception) {
                        Log.e("YouTubePlayerError", "Erro ao tentar carregar o vídeo: ${e.message}")
                    }
                }
            }

            override fun onInitializationFailure(provider: YouTubePlayer.Provider?, error: YouTubeInitializationResult?) {
                // Tratar falha de inicialização
                Log.e("YouTubePlayerError", "Falha ao inicializar o YouTube Player: $error")
                // Verifica o tipo do erro para fornecer mais informações
                if (error != null) {
                    when (error) {
                        YouTubeInitializationResult.SERVICE_MISSING -> {
                            Log.e("YouTubePlayerError", "Serviço do YouTube não encontrado no dispositivo.")
                        }
                        YouTubeInitializationResult.SERVICE_VERSION_UPDATE_REQUIRED -> {
                            Log.e("YouTubePlayerError", "Versão do YouTube precisa ser atualizada.")
                        }
                        YouTubeInitializationResult.DEVELOPER_KEY_INVALID -> {
                            Log.e("YouTubePlayerError", "Chave da API inválida.")
                        }
                        else -> {
                            Log.e("YouTubePlayerError", "Erro desconhecido: $error")
                        }
                    }
                }
            }
        })
    }
}

