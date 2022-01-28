package br.com.cwi.nespresso.data.network

import br.com.cwi.nespresso.data.entity.CoffeeResponse
import retrofit2.http.GET

interface NespressoApi {

    @GET("/cafes")
    suspend fun getCoffees() : List<CoffeeResponse>
}