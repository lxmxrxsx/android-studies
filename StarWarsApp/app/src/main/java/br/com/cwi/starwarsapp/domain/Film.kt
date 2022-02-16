package br.com.cwi.starwarsapp.domain

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class Film(
    val title: String,
    val episodeId: Int,
    private val releaseDateString: String
) {
    @RequiresApi(Build.VERSION_CODES.O)
    private val date: LocalDate = LocalDate.parse(releaseDateString, DateTimeFormatter.ISO_DATE)

    @RequiresApi(Build.VERSION_CODES.O)
    val releaseDate: String = "${date.dayOfMonth}/${date.monthValue}/${date.year}"
}