package br.com.cwi.nespresso.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cwi.nespresso.databinding.ActivityCapsulesBinding

class apsulesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCapsulesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapsulesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}