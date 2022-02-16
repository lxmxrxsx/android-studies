package br.com.cwi.starwarsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel = FilmsViewModel()
        super.onCreate(savedInstanceState)
        setContent {
            LaunchItems(viewModel)
        }
    }


    @Composable
    fun LaunchItems(vm: FilmsViewModel) {
        LaunchedEffect(Unit, block = {
            vm.getFilmsList()
        })
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Row {
                            Text("StarWars Movies")
                        }
                    })
            },
            content = {
                if (vm.errorMessage.isEmpty()) {
                    LazyColumn() {
                        items(items = vm.filmsList) { film ->
                            FilmCard(film = film)
                        }
                    }
                } else {
                    Text(text = vm.errorMessage)
                }
            })
    }

}