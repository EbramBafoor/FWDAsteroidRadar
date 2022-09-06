package com.udacity.asteroidradar.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/asteroidradar/util/Constants;", "", "()V", "ASTEROID_DATABASE_NAME", "", "BASE_URL", "DEFAULT_END_DATE_DAYS", "", "FIRST_LAUNCH", "IMAGE_MEDIA", "PAST", "QUERY_DATE_FORMAT", "SHARED_PREFERENCE_NAME", "TODAY", "TODAY_ONWARD", "WORK_TAG", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_DATE_FORMAT = "YYYY-MM-dd";
    public static final int DEFAULT_END_DATE_DAYS = 7;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.nasa.gov/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASTEROID_DATABASE_NAME = "asteroid_database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_TAG = "asteroid_worker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFERENCE_NAME = "asteroid_preference";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_LAUNCH = "first_launch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_MEDIA = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TODAY_ONWARD = "week";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TODAY = "today";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAST = "past";
    @org.jetbrains.annotations.NotNull()
    public static final com.udacity.asteroidradar.util.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}