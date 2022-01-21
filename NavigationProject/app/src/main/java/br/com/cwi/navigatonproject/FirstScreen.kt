package br.com.cwi.navigatonproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import br.com.cwi.navigatonproject.databinding.ActivityFirstScreenBinding

class FirstScreen : AppCompatActivity() {
    private lateinit var binding: ActivityFirstScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickButton()

    }

    private fun onClickButton(){
        binding.fsButton.setOnClickListener{
            val intent = Intent(this, SecondScreen::class.java)
            intent.putExtra("TEXT", "mensagemdfjslkdfjdslk")
            startActivity(intent)
        }
    }
}