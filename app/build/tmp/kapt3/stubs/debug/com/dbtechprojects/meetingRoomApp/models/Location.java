package com.dbtechprojects.meetingRoomApp.models;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/models/Location;", "Landroid/os/Parcelable;", "building", "Lcom/dbtechprojects/meetingRoomApp/models/Building;", "floor", "Lcom/dbtechprojects/meetingRoomApp/models/Floor;", "region", "Lcom/dbtechprojects/meetingRoomApp/models/Region;", "site", "Lcom/dbtechprojects/meetingRoomApp/models/Site;", "(Lcom/dbtechprojects/meetingRoomApp/models/Building;Lcom/dbtechprojects/meetingRoomApp/models/Floor;Lcom/dbtechprojects/meetingRoomApp/models/Region;Lcom/dbtechprojects/meetingRoomApp/models/Site;)V", "getBuilding", "()Lcom/dbtechprojects/meetingRoomApp/models/Building;", "getFloor", "()Lcom/dbtechprojects/meetingRoomApp/models/Floor;", "getRegion", "()Lcom/dbtechprojects/meetingRoomApp/models/Region;", "getSite", "()Lcom/dbtechprojects/meetingRoomApp/models/Site;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Location implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.dbtechprojects.meetingRoomApp.models.Building building = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.dbtechprojects.meetingRoomApp.models.Floor floor = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.dbtechprojects.meetingRoomApp.models.Region region = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.dbtechprojects.meetingRoomApp.models.Site site = null;
    public static final android.os.Parcelable.Creator<com.dbtechprojects.meetingRoomApp.models.Location> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Building getBuilding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Floor getFloor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Region getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Site getSite() {
        return null;
    }
    
    public Location(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Building building, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Floor floor, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Region region, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Site site) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Building component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Floor component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Region component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Site component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.Location copy(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Building building, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Floor floor, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Region region, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.Site site) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.dbtechprojects.meetingRoomApp.models.Location> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.dbtechprojects.meetingRoomApp.models.Location[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.dbtechprojects.meetingRoomApp.models.Location createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}