package br.com.cwi.nav_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cwi.nav_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}