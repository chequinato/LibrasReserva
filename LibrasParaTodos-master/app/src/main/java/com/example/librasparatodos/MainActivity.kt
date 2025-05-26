package com.example.librasparatodos

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.librasparatodos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflando o layout com o ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Configuração para garantir que a tela ocupe toda a área disponível
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets //
        }

        // Configura o clique no botão
        binding.button.setOnClickListener {
            // Cria um Intent para abrir a TelaVideos
            val navegarSegundaTela = Intent(this, TelaVideos::class.java)
            startActivity(navegarSegundaTela) // Inicia a segunda tela
        }
    }

}
