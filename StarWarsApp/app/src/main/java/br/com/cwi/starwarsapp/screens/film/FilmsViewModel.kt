package br.com.cwi.starwarsapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.cwi.starwarsapp.data.mapper.FilmPreviewMapper
import br.com.cwi.starwarsapp.data.repository.FilmsRepositoryImpl
import br.com.cwi.starwarsapp.domain.Film
import kotlinx.coroutines.launch
import java.lang.Exception

class FilmsViewModel : ViewModel() {
    private val repository = FilmsRepositoryImpl(FilmPreviewMapper())
    var errorMessage:String by mutableStateOf("")
    private val _filmsList = mutableStateListOf<Film>()
    val filmsList: List<Film> get() = _filmsList

    fun getFilmsList(){
        viewModelScope.launch {
            try {
                _filmsList.clear()
                _filmsList.addAll(repository.getFilms())
            } catch (e: Exception){
                errorMessage = e.message.toString()
            }
        }
    }
}