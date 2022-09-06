package com.udacity.asteroidradar.presentation.asteroids_list.adapter

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.udacity.asteroidradar.data.room.AsteroidEntity
import com.udacity.asteroidradar.databinding.LayoutAsteroidListItemBinding
import com.udacity.asteroidradar.presentation.asteroids_list.MainFragmentDirections


class AsteroidViewHolder(private val binding: LayoutAsteroidListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(asteroidItem: AsteroidEntity) {
        binding.apply {
            asteroid = asteroidItem
            layoutAsteroidItemClContainer.setOnClickListener {
                val action = MainFragmentDirections.actionShowDetail(asteroidItem)
                it.findNavController().navigate(action)
            }
            executePendingBindings()
        }
    }
}