package br.com.cwi.nav_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.cwi.nav_app.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
    private lateinit var binding: FragmentThirdScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
        onClickGoToFourthScreen()

        return binding.root
    }


    private fun onClickGoToFourthScreen() {
        binding.btGoFromThirdToFourthScreen.setOnClickListener {
            val action = ThirdScreenDirections.actionThirdScreenToFourthScreen()
            Navigation.findNavController(binding.root).navigate(action)
        }
    }
}