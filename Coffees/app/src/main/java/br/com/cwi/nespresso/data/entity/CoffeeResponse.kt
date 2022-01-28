package br.com.cwi.nespresso.data.entity

import com.squareup.moshi.Json

data class CoffeeResponse (
    @Json(name = "id") val id:Int?,
    @Json(name = "nome") val name: String?,
    @Json(name = "descricao") val description:String?,
    @Json(name = "intensidade") val intensity: Int?,
    @Json(name = "precoUnitario") val price: Double?,
    @Json(name = "imagem") val image: String?,
    @Json(name = "medidas") val volume: List<String>?,
    @Json(name = "origem") val origin: String?
        )


