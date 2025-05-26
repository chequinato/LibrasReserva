package com.example.librasparatodos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaVideos : AppCompatActivity() {
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
                    // Vai para a tela inicial (MainActivity)
                    startActivity(Intent(this, MainActivity::class.java))
                    overridePendingTransition(0, 0) // Remove animação de troca de tela
                    true
                }
                R.id.profile -> {
                    // Vai para a tela de criadores
                    startActivity(Intent(this, TelaCriadores::class.java))
                    overridePendingTransition(0, 0) // Remove animação de troca de tela
                    true
                }
                R.id.videos -> {
                    // Já está na tela atual (TelaVideos)
                    true
                }
                else -> false
            }
        }
    }
}
