package com.udacity.asteroidradar.data.room;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(tableName = "asteroids_table")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020.H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012\u00a8\u00069"}, d2 = {"Lcom/udacity/asteroidradar/data/room/AsteroidEntity;", "Landroid/os/Parcelable;", "codename", "", "closeApproachDate", "absoluteMagnitude", "", "estimatedDiameter", "isPotentiallyHazardous", "", "relativeVelocity", "distanceFromEarth", "id", "", "(Ljava/lang/String;Ljava/lang/String;DDZDDJ)V", "getAbsoluteMagnitude", "()D", "setAbsoluteMagnitude", "(D)V", "getCloseApproachDate", "()Ljava/lang/String;", "setCloseApproachDate", "(Ljava/lang/String;)V", "getCodename", "setCodename", "getDistanceFromEarth", "setDistanceFromEarth", "getEstimatedDiameter", "setEstimatedDiameter", "getId", "()J", "()Z", "setPotentiallyHazardous", "(Z)V", "getRelativeVelocity", "setRelativeVelocity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class AsteroidEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "codename")
    private java.lang.String codename;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "close_approach_date")
    private java.lang.String closeApproachDate;
    @androidx.room.ColumnInfo(name = "absolute_magnitude")
    private double absoluteMagnitude;
    @androidx.room.ColumnInfo(name = "estimated_diameter")
    private double estimatedDiameter;
    @androidx.room.ColumnInfo(name = "is_potentially_hazardous")
    private boolean isPotentiallyHazardous;
    @androidx.room.ColumnInfo(name = "relative_velocity")
    private double relativeVelocity;
    @androidx.room.ColumnInfo(name = "distance_from_earth")
    private double distanceFromEarth;
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final long id = 0L;
    public static final android.os.Parcelable.Creator<com.udacity.asteroidradar.data.room.AsteroidEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodename() {
        return null;
    }
    
    public final void setCodename(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloseApproachDate() {
        return null;
    }
    
    public final void setCloseApproachDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getAbsoluteMagnitude() {
        return 0.0;
    }
    
    public final void setAbsoluteMagnitude(double p0) {
    }
    
    public final double getEstimatedDiameter() {
        return 0.0;
    }
    
    public final void setEstimatedDiameter(double p0) {
    }
    
    public final boolean isPotentiallyHazardous() {
        return false;
    }
    
    public final void setPotentiallyHazardous(boolean p0) {
    }
    
    public final double getRelativeVelocity() {
        return 0.0;
    }
    
    public final void setRelativeVelocity(double p0) {
    }
    
    public final double getDistanceFromEarth() {
        return 0.0;
    }
    
    public final void setDistanceFromEarth(double p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public AsteroidEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String codename, @org.jetbrains.annotations.NotNull()
    java.lang.String closeApproachDate, double absoluteMagnitude, double estimatedDiameter, boolean isPotentiallyHazardous, double relativeVelocity, double distanceFromEarth, long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.data.room.AsteroidEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String codename, @org.jetbrains.annotations.NotNull()
    java.lang.String closeApproachDate, double absoluteMagnitude, double estimatedDiameter, boolean isPotentiallyHazardous, double relativeVelocity, double distanceFromEarth, long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.udacity.asteroidradar.data.room.AsteroidEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.udacity.asteroidradar.data.room.AsteroidEntity[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.udacity.asteroidradar.data.room.AsteroidEntity createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}