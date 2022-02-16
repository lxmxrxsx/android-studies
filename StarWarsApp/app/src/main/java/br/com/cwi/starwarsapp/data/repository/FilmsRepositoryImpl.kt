package br.com.cwi.starwarsapp.data.repository

import br.com.cwi.starwarsapp.data.mapper.FilmPreviewMapper
import br.com.cwi.starwarsapp.data.network.RetrofitConfig
import br.com.cwi.starwarsapp.data.network.StarWarsApi
import br.com.cwi.starwarsapp.domain.Film

class FilmsRepositoryImpl(
    private val filmPreviewMapper: FilmPreviewMapper
): StarWarsRepository {
    private val api: StarWarsApi = RetrofitConfig.service

    override suspend fun getFilms(): List<Film> {
        return filmPreviewMapper.toDomain(api.getFilms().results)
    }

}