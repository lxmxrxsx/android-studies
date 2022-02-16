package br.com.cwi.starwarsapp.data.entity

import com.squareup.moshi.Json

data class FilmResponse(
    @Json(name = "title") val title: String,
    @Json(name = "episode_id") val episodeId: Int,
    @Json(name = "release_date") val releaseDate: String
)