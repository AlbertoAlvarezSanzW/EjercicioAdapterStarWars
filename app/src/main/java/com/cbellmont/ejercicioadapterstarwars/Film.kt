package com.cbellmont.ejercicioadapterstarwars


class Film(var id : Int, var name : String, var intro : String) {
    fun getUrlImage() : String {
        return when (id) {
            1 -> "https://upload.wikimedia.org/wikipedia/en/4/40/Star_Wars_Phantom_Menace_poster.jpg"
            2 -> "https://upload.wikimedia.org/wikipedia/en/3/32/Star_Wars_-_Episode_II_Attack_of_the_Clones_%28movie_poster%29.jpg"
            3 -> "https://upload.wikimedia.org/wikipedia/en/9/93/Star_Wars_Episode_III_Revenge_of_the_Sith_poster.jpg"
            4 -> "https://upload.wikimedia.org/wikipedia/en/8/87/StarWarsMoviePoster1977.jpg"
            5 -> "https://upload.wikimedia.org/wikipedia/en/3/3c/SW_-_Empire_Strikes_Back.jpg"
            6 -> "https://upload.wikimedia.org/wikipedia/en/b/b2/ReturnOfTheJediPoster1983.jpg"
            7 -> "https://static.wikia.nocookie.net/esstarwars/images/2/2e/El_Despertar_de_la_Fuerza_Poster.jpg/revision/latest/top-crop/width/360/height/450?cb=20180412014438"
            8 -> "https://static.wikia.nocookie.net/doblaje/images/6/6c/Star_wars_los_ultimos_jedi_65170.jpg/revision/latest?cb=20171010034410&path-prefix=es"
            9 -> "https://lumiere-a.akamaihd.net/v1/images/image_a89e70e8.jpeg?region=0%2C0%2C540%2C810"
            else -> "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/George_Lucas.jpg/330px-George_Lucas.jpg"

        }
    }
}