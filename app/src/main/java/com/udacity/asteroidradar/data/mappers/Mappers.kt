package com.udacity.asteroidradar.data.mappers

import android.annotation.SuppressLint

import com.udacity.asteroidradar.data.room.AsteroidEntity
import com.udacity.asteroidradar.data.api.dtos.Asteroid

import com.udacity.asteroidradar.util.Constants.QUERY_DATE_FORMAT
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList



@SuppressLint("SimpleDateFormat", "WeekBasedYear")
val today: String = SimpleDateFormat(QUERY_DATE_FORMAT).format(Date())


fun List<Asteroid>.convertToAsteroidEntity(): List<AsteroidEntity> {
    val asteroidEntityList = ArrayList<AsteroidEntity>()
    asteroidEntityList.addAll(this.map { asteroidItem ->
        AsteroidEntity(
            asteroidItem.codename,
            asteroidItem.closeApproachDate,
            asteroidItem.absoluteMagnitude,
            asteroidItem.estimatedDiameter,
            asteroidItem.isPotentiallyHazardous,
            asteroidItem.relativeVelocity,
            asteroidItem.distanceFromEarth,
            asteroidItem.id
        )
    })
    return asteroidEntityList
}



