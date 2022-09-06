package com.udacity.asteroidradar.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\rJ\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\rJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/udacity/asteroidradar/repository/MainRepository;", "", "api", "Lcom/udacity/asteroidradar/data/api/ApiService;", "dp", "Lcom/udacity/asteroidradar/data/room/AsteroidDatabase;", "(Lcom/udacity/asteroidradar/data/api/ApiService;Lcom/udacity/asteroidradar/data/room/AsteroidDatabase;)V", "asteroidDao", "Lcom/udacity/asteroidradar/data/room/AsteroidDao;", "fetchAndSaveAsteroids", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPictureOfDay", "Landroidx/lifecycle/LiveData;", "Lcom/udacity/asteroidradar/util/Resource;", "Lcom/udacity/asteroidradar/data/api/dtos/PictureOfDay;", "getAsteroidsOfTodayFromLocal", "", "Lcom/udacity/asteroidradar/data/room/AsteroidEntity;", "getAsteroidsTodayOnWardsFromLocal", "getPastAsteroids", "app_debug"})
public final class MainRepository {
    private final com.udacity.asteroidradar.data.room.AsteroidDao asteroidDao = null;
    private final com.udacity.asteroidradar.data.api.ApiService api = null;
    private final com.udacity.asteroidradar.data.room.AsteroidDatabase dp = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getAsteroidsTodayOnWardsFromLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getAsteroidsOfTodayFromLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getPastAsteroids() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPictureOfDay(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAndSaveAsteroids(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.data.api.ApiService api, @org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.data.room.AsteroidDatabase dp) {
        super();
    }
}