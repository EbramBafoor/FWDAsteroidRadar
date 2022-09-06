package com.udacity.asteroidradar.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/udacity/asteroidradar/util/LoadingState;", "T", "", "()V", "LoadingObject", "Unit", "Lcom/udacity/asteroidradar/util/LoadingState$Unit;", "Lcom/udacity/asteroidradar/util/LoadingState$LoadingObject;", "app_debug"})
public abstract class LoadingState<T extends java.lang.Object> {
    
    private LoadingState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/udacity/asteroidradar/util/LoadingState$Unit;", "Lcom/udacity/asteroidradar/util/LoadingState;", "", "()V", "app_debug"})
    public static final class Unit extends com.udacity.asteroidradar.util.LoadingState {
        @org.jetbrains.annotations.NotNull()
        public static final com.udacity.asteroidradar.util.LoadingState.Unit INSTANCE = null;
        
        private Unit() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/udacity/asteroidradar/util/LoadingState$LoadingObject;", "Lcom/udacity/asteroidradar/util/LoadingState;", "", "()V", "app_debug"})
    public static final class LoadingObject extends com.udacity.asteroidradar.util.LoadingState {
        @org.jetbrains.annotations.NotNull()
        public static final com.udacity.asteroidradar.util.LoadingState.LoadingObject INSTANCE = null;
        
        private LoadingObject() {
            super();
        }
    }
}