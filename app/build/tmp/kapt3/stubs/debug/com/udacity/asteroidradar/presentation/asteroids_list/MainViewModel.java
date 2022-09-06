package com.udacity.asteroidradar.presentation.asteroids_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020#J\u0006\u0010(\u001a\u00020#R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0018\u00a8\u0006)"}, d2 = {"Lcom/udacity/asteroidradar/presentation/asteroids_list/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/udacity/asteroidradar/repository/MainRepository;", "workManager", "Landroidx/work/WorkManager;", "(Lcom/udacity/asteroidradar/repository/MainRepository;Landroidx/work/WorkManager;)V", "_loadingState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/udacity/asteroidradar/util/LoadingState;", "asteroidList", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/udacity/asteroidradar/data/room/AsteroidEntity;", "getAsteroidList", "()Landroidx/lifecycle/MediatorLiveData;", "currentAsteroidList", "", "listOfPastAsteroids", "Landroidx/lifecycle/LiveData;", "listOfTodayAsteroids", "listOfTodayOnwardsAsteroids", "loadingState", "getLoadingState", "()Landroidx/lifecycle/LiveData;", "picture", "Lcom/udacity/asteroidradar/util/Resource;", "Lcom/udacity/asteroidradar/data/api/dtos/PictureOfDay;", "getPicture", "()Landroidx/lifecycle/MutableLiveData;", "workerState", "", "Landroidx/work/WorkInfo;", "getWorkerState", "sortAsteroids", "", "event", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent;", "startLoading", "startWorker", "stopLoading", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.LoadingState<?>> _loadingState;
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> listOfTodayOnwardsAsteroids = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> listOfTodayAsteroids = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> listOfPastAsteroids = null;
    private java.lang.String currentAsteroidList = "week";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> asteroidList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>> picture = null;
    private final com.udacity.asteroidradar.repository.MainRepository repository = null;
    private final androidx.work.WorkManager workManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.asteroidradar.util.LoadingState<?>> getLoadingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkerState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getAsteroidList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>> getPicture() {
        return null;
    }
    
    public final void sortAsteroids(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent event) {
    }
    
    public final void startWorker() {
    }
    
    public final void startLoading() {
    }
    
    public final void stopLoading() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.repository.MainRepository repository, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkManager workManager) {
        super();
    }
}