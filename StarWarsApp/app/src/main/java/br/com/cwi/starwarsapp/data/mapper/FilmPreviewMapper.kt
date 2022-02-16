package br.com.cwi.starwarsapp.data.mapper

import br.com.cwi.starwarsapp.data.entity.FilmResponse
import br.com.cwi.starwarsapp.domain.Film

class FilmPreviewMapper : DomainMapper<FilmResponse, Film> {
    override fun toDomain(from: FilmResponse): Film = Film(
        episodeId = from.episodeId,
        releaseDateString = from.releaseDate,
        title = from.title
    )

    override fun toDomain(from: List<FilmResponse>): List<Film> = from.map {
        toDomain(it)
    }
}