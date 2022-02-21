package br.com.cwi.starwarsapp.screens.film

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import br.com.cwi.starwarsapp.FilmCard
import br.com.cwi.starwarsapp.FilmsViewModel

@Composable
fun FilmScreen() {
    val vm = FilmsViewModel()
    LaunchedEffect(Unit, block = {
        vm.getFilmsList()
    })

    if (vm.errorMessage.isEmpty()) {
        LazyColumn() {
            items(items = vm.filmsList) { film ->
                FilmCard(film = film)
            }
        }
    } else {
        Text(text = vm.errorMessage)
    }

}