package com.udacity.asteroidradar.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/udacity/asteroidradar/data/api/ApiService;", "", "getAsteroids", "Lokhttp3/ResponseBody;", "startDate", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPictureOfDay", "Lcom/udacity/asteroidradar/data/api/dtos/PictureOfDay;", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.udacity.asteroidradar.data.api.ApiService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "n8oYNePF3b36dgmhWldpnKrWXOhs7CL1SOpGbtx2";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/planetary/apod")
    public abstract java.lang.Object getPictureOfDay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.asteroidradar.data.api.dtos.PictureOfDay> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "neo/rest/v1/feed")
    public abstract java.lang.Object getAsteroids(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "start_date")
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> p2);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/udacity/asteroidradar/data/api/ApiService$Companion;", "", "()V", "API_KEY", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "n8oYNePF3b36dgmhWldpnKrWXOhs7CL1SOpGbtx2";
        
        private Companion() {
            super();
        }
    }
}