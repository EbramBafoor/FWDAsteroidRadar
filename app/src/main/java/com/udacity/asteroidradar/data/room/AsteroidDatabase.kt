package com.udacity.asteroidradar.data.room

import androidx.room.Database
import androidx.room.RoomDatabase



@Database(
    entities = [AsteroidEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AsteroidDatabase : RoomDatabase() {

    abstract fun asteroidDao(): AsteroidDao
}

