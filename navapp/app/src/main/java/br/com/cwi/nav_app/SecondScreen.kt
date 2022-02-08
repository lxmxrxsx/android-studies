package br.com.cwi.nav_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import br.com.cwi.nav_app.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {

    private val args: SecondScreenArgs by navArgs()
    private lateinit var binding: FragmentSecondScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondScreenBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.tvSecondScreen.text = args.number.toString()
        onClickButtonGoBackToFirstScreen()
        return view
    }

    private fun onClickButtonGoBackToFirstScreen(){
        binding.btGoFromSecondToFirstScreen.setOnClickListener {
            val action = SecondScreenDirections.actionSecondScreenToFirstScreen()
            Navigation.findNavController(binding.root).navigate(action)
        }
    }

}