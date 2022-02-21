package br.com.cwi.starwarsapp

import android.widget.Toast
import androidx.activity.contextaware.ContextAware
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

import br.com.cwi.starwarsapp.domain.Film

@Composable
fun FilmCard(film: Film) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .border(1.dp, Color.Black)
            .padding(16.dp)
            .clickable { Toast.makeText(context, "CLICOU NO EPISODIO ${film.episodeId}", Toast.LENGTH_LONG).show() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        Text(
            text = "${film.title} episódio ${film.episodeId}",
            color = Color.Black
        )

        Text(
            text = "lançamento: ${film.releaseDate}"
        )

    }
}