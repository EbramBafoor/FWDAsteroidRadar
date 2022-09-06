package com.udacity.asteroidradar.data.room;

import java.lang.System;

@androidx.room.Database(entities = {com.udacity.asteroidradar.data.room.AsteroidEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/udacity/asteroidradar/data/room/AsteroidDatabase;", "Landroidx/room/RoomDatabase;", "()V", "asteroidDao", "Lcom/udacity/asteroidradar/data/room/AsteroidDao;", "app_debug"})
public abstract class AsteroidDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.udacity.asteroidradar.data.room.AsteroidDao asteroidDao();
    
    public AsteroidDatabase() {
        super();
    }
}