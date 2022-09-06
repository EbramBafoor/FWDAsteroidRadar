package com.udacity.asteroidradar.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.udacity.asteroidradar.data.api.ApiService
import com.udacity.asteroidradar.data.room.AsteroidDao

import com.udacity.asteroidradar.data.api.dtos.Asteroid
import com.udacity.asteroidradar.data.api.dtos.PictureOfDay
import com.udacity.asteroidradar.data.mappers.convertToAsteroidEntity
import com.udacity.asteroidradar.data.room.AsteroidDatabase
import com.udacity.asteroidradar.util.Constants.IMAGE_MEDIA
import com.udacity.asteroidradar.util.Resource
import com.udacity.asteroidradar.util.parseAsteroidsJsonResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import okio.IOException
import org.json.JSONObject
import retrofit2.HttpException
import javax.inject.Inject


class MainRepository @Inject constructor(
    private val api: ApiService,
    private val dp: AsteroidDatabase
) {
    private val asteroidDao = dp.asteroidDao()


    fun getAsteroidsTodayOnWardsFromLocal() = asteroidDao.getAsteroidsTodayOnWards()
    fun getAsteroidsOfTodayFromLocal() = asteroidDao.getAsteroidsOfToday()
    fun getPastAsteroids() = asteroidDao.getPastAsteroids()


    suspend fun fetchPictureOfDay(): LiveData<Resource<PictureOfDay>> {
        val result: MutableLiveData<Resource<PictureOfDay>> = MutableLiveData()

        withContext(Dispatchers.IO){
            result.postValue(Resource.Loading(true))
            delay(500L)
            try {
                val remotePicture = api.getPictureOfDay()
                if (remotePicture.mediaType == IMAGE_MEDIA) {
                    result.postValue(Resource.Success(remotePicture))
                }
            } catch (e: HttpException){
                result.postValue(
                    Resource.Error("No Connection")
                )

            } catch (e: IOException){
                result.postValue(
                    Resource.Error("No Connection")
                )
            }
        }

        return result
    }

    suspend fun fetchAndSaveAsteroids() {

        withContext(Dispatchers.IO) {
            val response: ResponseBody = api.getAsteroids()
            val asteroidList =
                parseAsteroidsJsonResult(JSONObject(response.string())) as List<Asteroid>
            asteroidList.convertToAsteroidEntity().forEach { asteroid ->
                asteroidDao.insertAsteroid(asteroid)
            }
        }
    }

}
