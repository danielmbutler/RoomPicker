package com.dbtechprojects.meetingRoomApp.models;

import java.lang.System;

@androidx.room.Entity(tableName = "roomdetails", indices = {@androidx.room.Index(unique = true, value = {"key"})})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00aa\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u00104J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\t\u0010;\u001a\u00020\rH\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR \u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010\'\u00a8\u0006A"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "Landroid/os/Parcelable;", "Roomid", "", "capacity", "equipment", "", "Lcom/dbtechprojects/meetingRoomApp/models/Equipment;", "facilities", "Lcom/dbtechprojects/meetingRoomApp/models/Facility;", "features", "Lcom/dbtechprojects/meetingRoomApp/models/Feature;", "heroImageUrl", "", "key", "location", "Lcom/dbtechprojects/meetingRoomApp/models/Location;", "name", "services", "Lcom/dbtechprojects/meetingRoomApp/models/Service;", "timestamp", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/dbtechprojects/meetingRoomApp/models/Location;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getRoomid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCapacity", "getEquipment", "()Ljava/util/List;", "getFacilities", "getFeatures", "getHeroImageUrl", "()Ljava/lang/String;", "getKey", "getLocation", "()Lcom/dbtechprojects/meetingRoomApp/models/Location;", "getName", "getServices", "getTimestamp", "setTimestamp", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/dbtechprojects/meetingRoomApp/models/Location;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class RoomDetailsItem implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey()
    private final java.lang.Integer Roomid = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "capacity")
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final java.lang.Integer capacity = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "equipment")
    @com.google.gson.annotations.SerializedName(value = "equipment")
    private final java.util.List<com.dbtechprojects.meetingRoomApp.models.Equipment> equipment = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "facilities")
    @com.google.gson.annotations.SerializedName(value = "facilities")
    private final java.util.List<com.dbtechprojects.meetingRoomApp.models.Facility> facilities = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "features")
    @com.google.gson.annotations.SerializedName(value = "features")
    private final java.util.List<com.dbtechprojects.meetingRoomApp.models.Feature> features = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "heroImageUrl")
    @com.google.gson.annotations.SerializedName(value = "heroImageUrl")
    private final java.lang.String heroImageUrl = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "key")
    @com.google.gson.annotations.SerializedName(value = "key")
    private final java.lang.String key = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    @com.google.gson.annotations.SerializedName(value = "location")
    private final com.dbtechprojects.meetingRoomApp.models.Location location = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "services")
    @com.google.gson.annotations.SerializedName(value = "services")
    private final java.util.List<com.dbtechprojects.meetingRoomApp.models.Service> services = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "timestamp")
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private java.lang.String timestamp;
    public static final android.os.Parcelable.Creator<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRoomid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Equipment> getEquipment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Facility> getFacilities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Feature> getFeatures() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeroImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dbtechprojects.meetingRoomApp.models.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Service> getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public RoomDetailsItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer Roomid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Equipment> equipment, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Facility> facilities, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Feature> features, @org.jetbrains.annotations.Nullable()
    java.lang.String heroImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    com.dbtechprojects.meetingRoomApp.models.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Service> services, @org.jetbrains.annotations.Nullable()
    java.lang.String timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Equipment> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Facility> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Feature> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dbtechprojects.meetingRoomApp.models.Location component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dbtechprojects.meetingRoomApp.models.Service> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer Roomid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Equipment> equipment, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Facility> facilities, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Feature> features, @org.jetbrains.annotations.Nullable()
    java.lang.String heroImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    com.dbtechprojects.meetingRoomApp.models.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.Service> services, @org.jetbrains.annotations.Nullable()
    java.lang.String timestamp) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}