package br.com.cwi.nav_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.cwi.nav_app.databinding.FragmentFourthScreenBinding


class FourthScreen : Fragment() {
    private lateinit var binding: FragmentFourthScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourthScreenBinding.inflate(inflater, container,false)
        onClickGoToFirstScreen()
        return binding.root
    }

    private fun onClickGoToFirstScreen(){
        val action = FourthScreenDirections.actionFourthScreenToFirstScreen()

        binding.btGoFromFourthToFirstScreen.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(action)
        }
    }

}