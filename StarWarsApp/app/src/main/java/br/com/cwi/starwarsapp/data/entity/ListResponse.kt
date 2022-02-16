package br.com.cwi.starwarsapp.data.entity

data class ListResponse<T>(
    val results: List<T>
)
