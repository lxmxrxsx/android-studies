package br.com.cwi.starwarsapp.data.entity

import com.squareup.moshi.Json

data class FilmResponsePreview(
    @Json(name = "title") val title: String,
    @Json(name = "episode_id") val episode_id: Int,
    @Json(name = "release_date") val release_date: String
)