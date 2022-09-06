package com.udacity.asteroidradar.presentation.asteroid_details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.udacity.asteroidradar.data.room.AsteroidEntity
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(val selectedAsteroid: AsteroidEntity) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
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

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): DetailFragmentArgs {
            bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
            val __selectedAsteroid : AsteroidEntity?
            if (bundle.containsKey("selectedAsteroid")) {
                if (Parcelable::class.java.isAssignableFrom(AsteroidEntity::class.java) ||
                        Serializable::class.java.isAssignableFrom(AsteroidEntity::class.java)) {
                    __selectedAsteroid = bundle.get("selectedAsteroid") as AsteroidEntity?
                } else {
                    throw UnsupportedOperationException(AsteroidEntity::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__selectedAsteroid == null) {
                    throw IllegalArgumentException("Argument \"selectedAsteroid\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"selectedAsteroid\" is missing and does not have an android:defaultValue")
            }
            return DetailFragmentArgs(__selectedAsteroid)
        }
    }
}
