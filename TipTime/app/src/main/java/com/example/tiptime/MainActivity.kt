package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val costString: String = binding.costOfService.text.toString()
        val costValue: Double? = costString.toDoubleOrNull()

        if (costValue == null) {
            binding.tipAmount.text = ""
            return
        } else {
            val tipPercentage: Double = when (binding.tipOptions.checkedRadioButtonId) {
                binding.tipOptionAmazing.id -> 0.2
                binding.tipOptionGood.id -> 0.18
                else -> 0.15
            }

            var tipValue: Double = costValue * tipPercentage

            if (binding.roundUpSwitch.isChecked) {
                tipValue = ceil(tipValue)
            }
            val tipAmountString: String = NumberFormat.getCurrencyInstance().format(tipValue)

            binding.tipAmount.text = getString(R.string.tip_amount, tipAmountString)
        }
    }
}