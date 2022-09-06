package com.udacity.asteroidradar.presentation.asteroids_list

import androidx.lifecycle.*
import androidx.work.*
import com.udacity.asteroidradar.data.room.AsteroidEntity
import com.udacity.asteroidradar.data.api.dtos.PictureOfDay
import com.udacity.asteroidradar.repository.MainRepository
import com.udacity.asteroidradar.util.Constants.PAST
import com.udacity.asteroidradar.util.Constants.TODAY
import com.udacity.asteroidradar.util.Constants.TODAY_ONWARD
import com.udacity.asteroidradar.util.Constants.WORK_TAG
import com.udacity.asteroidradar.util.LoadingState
import com.udacity.asteroidradar.util.Resource
import com.udacity.asteroidradar.worker.AsteroidWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository,
    private val workManager: WorkManager
) : ViewModel() {

    private var _loadingState = MutableLiveData<LoadingState<*>>()
    val loadingState: LiveData<LoadingState<*>> get() = _loadingState

    val workerState: LiveData<MutableList<WorkInfo>>
        get() = workManager.getWorkInfosByTagLiveData(WORK_TAG)

    private val listOfTodayOnwardsAsteroids: LiveData<List<AsteroidEntity?>> =
        repository.getAsteroidsTodayOnWardsFromLocal()

    private val listOfTodayAsteroids: LiveData<List<AsteroidEntity?>> =
        repository.getAsteroidsOfTodayFromLocal()

    private val listOfPastAsteroids = repository.getPastAsteroids()

    private var currentAsteroidList = TODAY_ONWARD

    val asteroidList = MediatorLiveData<List<AsteroidEntity?>>()

    val picture: MutableLiveData<Resource<PictureOfDay>> = MutableLiveData()

    init {

        asteroidList.addSource(listOfTodayOnwardsAsteroids) { listOfAsteroids ->
            if (currentAsteroidList == TODAY_ONWARD) {
                listOfAsteroids?.let { asteroidList.value = it }
            }
        }

        asteroidList.addSource(listOfTodayAsteroids) { listOfAsteroids ->
            if (currentAsteroidList == TODAY) {
                listOfAsteroids?.let { asteroidList.value = it }
            }
        }

        asteroidList.addSource(listOfPastAsteroids) { listOfAsteroids ->
            if (currentAsteroidList == PAST) {
                listOfAsteroids?.let { asteroidList.value = it }
            }
        }
    }

    fun sortAsteroids(event : AsteroidsEvent){
        when(event){
            is AsteroidsEvent.Week -> {
                listOfTodayOnwardsAsteroids.value?.let { asteroidList.value = it }
                currentAsteroidList = event.sortType
            }
            is AsteroidsEvent.Today -> {
                listOfTodayAsteroids.value?.let { asteroidList.value = it }
                currentAsteroidList = event.sortType

            }
            is AsteroidsEvent.Past -> {
                listOfPastAsteroids.value?.let { asteroidList.value = it }
                currentAsteroidList = event.sortType

            }
        }
    }


    fun startWorker() {
        viewModelScope.launch {
            val workConstraints = Constraints.Builder()
                .setRequiresCharging(true)
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            val request = PeriodicWorkRequestBuilder<AsteroidWorker>(24, TimeUnit.HOURS)
                .setConstraints(workConstraints)
                .addTag(WORK_TAG)
                .setBackoffCriteria(
                    BackoffPolicy.LINEAR,
                    PeriodicWorkRequest.MIN_BACKOFF_MILLIS,
                    TimeUnit.MILLISECONDS
                ).build()

            workManager
                .enqueueUniquePeriodicWork("work_name", ExistingPeriodicWorkPolicy.KEEP, request)
        }
    }


    fun startLoading() {
        _loadingState.value = LoadingState.LoadingObject
    }

    fun stopLoading() {
        _loadingState.value = LoadingState.Unit
    }

}
