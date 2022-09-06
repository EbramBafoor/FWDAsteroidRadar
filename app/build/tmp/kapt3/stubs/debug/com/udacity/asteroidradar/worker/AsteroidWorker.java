package com.udacity.asteroidradar.worker;

import java.lang.System;

@androidx.hilt.work.HiltWorker()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/udacity/asteroidradar/worker/AsteroidWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "repository", "Lcom/udacity/asteroidradar/repository/MainRepository;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/udacity/asteroidradar/repository/MainRepository;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AsteroidWorker extends androidx.work.CoroutineWorker {
    private final com.udacity.asteroidradar.repository.MainRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    @dagger.assisted.AssistedInject()
    public AsteroidWorker(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.repository.MainRepository repository) {
        super(null, null);
    }
}