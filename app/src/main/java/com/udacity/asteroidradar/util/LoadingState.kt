package com.udacity.asteroidradar.util

sealed class LoadingState<T>() {
    object Unit : LoadingState<Nothing>()
    object LoadingObject : LoadingState<Nothing>()
}