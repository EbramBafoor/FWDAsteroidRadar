package com.udacity.asteroidradar.presentation.asteroids_list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.udacity.asteroidradar.R
import com.udacity.asteroidradar.data.room.AsteroidEntity
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class MainFragmentDirections private constructor() {
    private data class ActionShowDetail(val selectedAsteroid: AsteroidEntity) : NavDirections {
        override fun getActionId(): Int = R.id.action_showDetail

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(AsteroidEntity::class.java)) {
                result.putParcelable("selectedAsteroid", this.selectedAsteroid as Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(AsteroidEntity::class.java)) {
                result.putSerializable("selectedAsteroid", this.selectedAsteroid as Serializable)
            } else {
                throw UnsupportedOperationException(AsteroidEntity::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionShowDetail(selectedAsteroid: AsteroidEntity): NavDirections =
                ActionShowDetail(selectedAsteroid)
    }
}
