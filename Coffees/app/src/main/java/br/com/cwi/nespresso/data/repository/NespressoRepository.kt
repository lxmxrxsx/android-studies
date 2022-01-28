package br.com.cwi.nespresso.data.repository

import br.com.cwi.nespresso.data.network.NespressoApi
import br.com.cwi.nespresso.data.network.RetrofitConfig
import br.com.cwi.nespresso.data.entity.CoffeeResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class NespressoRepository {
    private val api: NespressoApi = RetrofitConfig.service

    suspend fun getCoffee() : List<CoffeeResponse>{
        return withContext(Dispatchers.IO){
        api.getCoffees()
        }
    }

}