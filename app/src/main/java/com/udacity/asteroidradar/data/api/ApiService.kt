package com.udacity.asteroidradar.data.api


import com.udacity.asteroidradar.data.api.dtos.PictureOfDay
import com.udacity.asteroidradar.data.mappers.today
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/planetary/apod")
    suspend fun getPictureOfDay(
        @Query("api_key") key: String = API_KEY
    ): PictureOfDay

    @GET("neo/rest/v1/feed")
    suspend fun getAsteroids(
        @Query("start_date") startDate: String = today,
        @Query("api_key") apiKey: String = API_KEY,
    ): ResponseBody


    companion object{
        const val API_KEY = "n8oYNePF3b36dgmhWldpnKrWXOhs7CL1SOpGbtx2"
    }
}