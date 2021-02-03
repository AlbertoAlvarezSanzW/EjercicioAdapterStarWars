package com.cbellmont.ejercicioadapterstarwars

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivityViewModel  : ViewModel() {

    private val films = mutableListOf(
        Film(1, "La Amenaza Fantasma", "1999"),
        Film(2, "El Ataque de los Clones", "2002"),
        Film(3, "La Venganza de los Sith", "2005"),
        Film(4, "Una Nueva Esperanza", "1977"),
        Film(5, "El Imperio Contraataca", "1980"),
        Film(6, "El Retorno del Jedi", "1983"),
        Film(7, "El Despertar de la fuerza", "2015"),
        Film(8, "Los últimos Jedi", "2017"),
        Film(9, "El ascenso de Skywalker", "2019")
    )

    suspend fun getFilms(): MutableList<Film> {
        delay(2000)
        return films
    }


    suspend fun getNewFilms() : MutableList<Film> {
        delay(2000)
        return films.subList(0,3)
    }

    suspend fun getOldFilms() : MutableList<Film> {
        delay(2000)
        return films.subList(3,6)
    }

    suspend fun getNewFilmsMalas() : MutableList<Film> {
        delay(2000)
        return films.subList(6,9)
    }
}