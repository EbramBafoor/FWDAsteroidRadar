package com.udacity.asteroidradar.presentation.asteroids_list

sealed class AsteroidsEvent(sortType: String) {
    data class Week(val sortType: String): AsteroidsEvent(sortType)
    data class Today(val sortType: String): AsteroidsEvent(sortType)
    data class Past(val sortType: String): AsteroidsEvent(sortType)

}