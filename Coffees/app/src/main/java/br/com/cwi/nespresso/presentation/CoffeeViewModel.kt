package br.com.cwi.nespresso.presentation


import br.com.cwi.nespresso.data.repository.NespressoRepository



class CoffeeViewModel: ViewModel() {
    private val api = NespressoRepository()


    private fun fetchCoffees(){
        viewModelScope.lauch{

        }
    }
}