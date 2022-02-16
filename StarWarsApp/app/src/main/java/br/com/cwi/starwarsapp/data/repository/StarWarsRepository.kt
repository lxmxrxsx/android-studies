package br.com.cwi.starwarsapp.data.repository

import br.com.cwi.starwarsapp.domain.Film


interface StarWarsRepository {
    suspend fun getFilms(): List<Film>
}