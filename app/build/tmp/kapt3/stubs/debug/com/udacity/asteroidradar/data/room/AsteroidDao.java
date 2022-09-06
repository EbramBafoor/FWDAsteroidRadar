package com.udacity.asteroidradar.data.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\'J \u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\'J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/udacity/asteroidradar/data/room/AsteroidDao;", "", "getAsteroidsOfToday", "Landroidx/lifecycle/LiveData;", "", "Lcom/udacity/asteroidradar/data/room/AsteroidEntity;", "date", "", "getAsteroidsTodayOnWards", "getPastAsteroids", "insertAsteroid", "", "asteroid", "(Lcom/udacity/asteroidradar/data/room/AsteroidEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AsteroidDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertAsteroid(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.data.room.AsteroidEntity asteroid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table WHERE close_approach_date >= :date ORDER by close_approach_date ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getAsteroidsTodayOnWards(@org.jetbrains.annotations.NotNull()
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table WHERE close_approach_date < :date ORDER by close_approach_date DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getPastAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM asteroids_table WHERE close_approach_date = :date")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> getAsteroidsOfToday(@org.jetbrains.annotations.NotNull()
    java.lang.String date);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}