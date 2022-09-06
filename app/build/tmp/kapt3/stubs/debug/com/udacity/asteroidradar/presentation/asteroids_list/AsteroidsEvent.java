package com.udacity.asteroidradar.presentation.asteroids_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent;", "", "sortType", "", "(Ljava/lang/String;)V", "Past", "Today", "Week", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Week;", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Today;", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Past;", "app_debug"})
public abstract class AsteroidsEvent {
    
    private AsteroidsEvent(java.lang.String sortType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Week;", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent;", "sortType", "", "(Ljava/lang/String;)V", "getSortType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Week extends com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sortType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSortType() {
            return null;
        }
        
        public Week(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent.Week copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
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
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Today;", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent;", "sortType", "", "(Ljava/lang/String;)V", "getSortType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Today extends com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sortType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSortType() {
            return null;
        }
        
        public Today(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent.Today copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
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
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent$Past;", "Lcom/udacity/asteroidradar/presentation/asteroids_list/AsteroidsEvent;", "sortType", "", "(Ljava/lang/String;)V", "getSortType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Past extends com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sortType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSortType() {
            return null;
        }
        
        public Past(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.udacity.asteroidradar.presentation.asteroids_list.AsteroidsEvent.Past copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sortType) {
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
    }
}