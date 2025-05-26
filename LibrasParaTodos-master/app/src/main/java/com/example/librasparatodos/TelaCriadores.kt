package com.example.librasparatodos

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaCriadores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_criadores)

        // Configuração do ajuste de padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configuração da navegação
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_bar)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Navegar para a tela principal
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.criadores -> {
                    // Já estamos na TelaCriadores
                    true
                }
                R.id.videos -> {
                    // Navegar para a tela de vídeos
                    startActivity(Intent(this, TelaVideos::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
