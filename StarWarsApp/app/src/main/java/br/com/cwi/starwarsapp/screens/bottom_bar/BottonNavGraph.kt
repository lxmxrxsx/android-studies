package br.com.cwi.starwarsapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.cwi.starwarsapp.screens.film.FilmComposable
import br.com.cwi.starwarsapp.screens.people.PeopleComposable

@Composable
fun BottonNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Film.route
    ){
        composable(route = BottomBarScreen.Film.route){
                FilmComposable()
        }
        composable(route = BottomBarScreen.People.route){
            PeopleComposable()
        }

    }
}