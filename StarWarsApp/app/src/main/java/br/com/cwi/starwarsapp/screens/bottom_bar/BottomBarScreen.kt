package br.com.cwi.starwarsapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.PeopleAlt
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route:String,
    val title:String,
    val icon: ImageVector
){
    object Film: BottomBarScreen(
        route = "film",
        title = "Film",
        icon = Icons.Default.Movie
    )
    object People: BottomBarScreen(
        route = "people",
        title = "People",
        icon = Icons.Default.PeopleAlt
    )
}
