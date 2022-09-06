package com.udacity.asteroidradar.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0007\u001a\"\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u0016H\u0007\u00a8\u0006\u0019"}, d2 = {"bindAsteroidStatusImage", "", "imageView", "Landroid/widget/ImageView;", "isHazardous", "", "bindDetailsStatusImage", "bindTextViewToAstronomicalUnit", "textView", "Landroid/widget/TextView;", "number", "", "bindTextViewToDisplayVelocity", "bindTextViewToKmUnit", "bindContentDescription", "bindLoadingState", "Landroid/widget/ProgressBar;", "responseState", "Lcom/udacity/asteroidradar/util/LoadingState;", "bindRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/udacity/asteroidradar/data/room/AsteroidEntity;", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"isLoading"})
    public static final void bindLoadingState(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar $this$bindLoadingState, @org.jetbrains.annotations.Nullable()
    com.udacity.asteroidradar.util.LoadingState<?> responseState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:contentDescription"})
    public static final void bindContentDescription(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$bindContentDescription, boolean isHazardous) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindRecyclerView, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> list) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"statusIcon"})
    public static final void bindAsteroidStatusImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, boolean isHazardous) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"asteroidStatusImage"})
    public static final void bindDetailsStatusImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, boolean isHazardous) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"astronomicalUnitText"})
    public static final void bindTextViewToAstronomicalUnit(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"kmUnitText"})
    public static final void bindTextViewToKmUnit(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"velocityText"})
    public static final void bindTextViewToDisplayVelocity(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
}