package br.com.cwi.navigatonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import br.com.cwi.navigatonproject.databinding.ActivityFirstScreenBinding
import br.com.cwi.navigatonproject.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    private val items: List<String> = listOf("pedra", "papel", "tesoura", "lagarto", "spock")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.rvItems
        recyclerView.adapter = RVAdapter(items)
    }
}