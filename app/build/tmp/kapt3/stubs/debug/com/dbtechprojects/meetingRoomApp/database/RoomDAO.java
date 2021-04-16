package com.dbtechprojects.meetingRoomApp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH\'J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/database/RoomDAO;", "", "deleteAllRoomDetailtems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllRoomItems", "getIndividualRoom", "Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "id", "", "getRoomdetails", "keyid", "", "getRooms", "", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "insertIndividualRoom", "room", "insertRoomDetailItem", "roomdetails", "(Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRooms", "app_debug"})
public abstract interface RoomDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM roomitems")
    public abstract java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem> getRooms();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM roomdetails WHERE `key` Like :keyid ")
    public abstract com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem getRoomdetails(@org.jetbrains.annotations.NotNull()
    java.lang.String keyid);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertRooms(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem> room);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertIndividualRoom(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.RoomItem room);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM roomitems WHERE id Like :id ")
    public abstract com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem getIndividualRoom(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRoomDetailItem(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem roomdetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM roomitems")
    public abstract java.lang.Object deleteAllRoomItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM roomdetails")
    public abstract java.lang.Object deleteAllRoomDetailtems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}