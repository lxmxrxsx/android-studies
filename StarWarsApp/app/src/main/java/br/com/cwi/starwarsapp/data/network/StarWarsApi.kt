package br.com.cwi.starwarsapp.data.network

import br.com.cwi.starwarsapp.data.entity.FilmResponse
import br.com.cwi.starwarsapp.data.entity.ListResponse
import retrofit2.http.GET


interface StarWarsApi {
    @GET("films")
    suspend fun getFilms() : ListResponse<FilmResponse>
}