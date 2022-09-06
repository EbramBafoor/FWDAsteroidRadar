package com.udacity.asteroidradar.presentation.asteroids_list.adapter

import androidx.recyclerview.widget.DiffUtil
import com.udacity.asteroidradar.data.room.AsteroidEntity

class DiffUtil : DiffUtil.ItemCallback<AsteroidEntity>() {
    override fun areItemsTheSame(oldItem: AsteroidEntity, newItem: AsteroidEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: AsteroidEntity, newItem: AsteroidEntity): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }

}