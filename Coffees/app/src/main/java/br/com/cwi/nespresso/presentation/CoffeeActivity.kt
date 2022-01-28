package br.com.cwi.nespresso.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cwi.nespresso.CoffeeAdapter
import br.com.cwi.nespresso.databinding.ActivityCoffeeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CoffeeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoffeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoffeeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        showItems()

    }

    private fun showItems(){
        CoroutineScope(Dispatchers.Main).launch{
            val recyclerView = binding.rvCoffeeList
            recyclerView.adapter = CoffeeAdapter(this@CoffeeActivity, coffees)
        }
    }
}