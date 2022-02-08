package br.com.cwi.nav_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.cwi.nav_app.databinding.FragmentFirstScreenBinding


class FirstScreen : Fragment() {
    private lateinit var binding: FragmentFirstScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        onClickButtonGoToSecondScreen()
        onClickButtonGoToThirdScreen()

        return view
    }

    private fun onClickButtonGoToSecondScreen(){
        val action = FirstScreenDirections.actionFirstScreenToSecondScreen(12)
        binding.btGoSecondScreen.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(action)
        }
    }

    private fun onClickButtonGoToThirdScreen(){
        val action = FirstScreenDirections.actionFirstScreenToThirdScreen()
        binding.btGoThridScreen.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(action)
        }
    }

}