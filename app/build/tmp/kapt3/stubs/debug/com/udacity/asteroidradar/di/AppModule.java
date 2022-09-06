package com.udacity.asteroidradar.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007J\u0012\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/udacity/asteroidradar/di/AppModule;", "", "()V", "getApiService", "Lcom/udacity/asteroidradar/data/api/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "getLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getMainRepository", "Lcom/udacity/asteroidradar/repository/MainRepository;", "apiService", "asteroidDatabase", "Lcom/udacity/asteroidradar/data/room/AsteroidDatabase;", "getMoshi", "Lcom/squareup/moshi/Moshi;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "getRetrofit", "moshi", "okHttpClient", "provideRunDatabase", "app", "Landroid/content/Context;", "provideSharedPreference", "Landroid/content/SharedPreferences;", "providesWorkManager", "Landroidx/work/WorkManager;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.udacity.asteroidradar.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences provideSharedPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.udacity.asteroidradar.data.room.AsteroidDatabase provideRunDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor getLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient getOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.udacity.asteroidradar.data.api.ApiService getApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.udacity.asteroidradar.repository.MainRepository getMainRepository(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.data.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.data.room.AsteroidDatabase asteroidDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.work.WorkManager providesWorkManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}