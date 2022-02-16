package br.com.cwi.starwarsapp.data.mapper

import br.com.cwi.starwarsapp.domain.Film

interface DomainMapper<in T, out Model> {
    fun toDomain(from: T): Model
    fun toDomain(from: List<T>): List<Film>
}