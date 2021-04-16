package com.dbtechprojects.meetingRoomApp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;", "", "api", "Lcom/dbtechprojects/meetingRoomApp/data/RoomApi;", "roomDao", "Lcom/dbtechprojects/meetingRoomApp/database/RoomDAO;", "(Lcom/dbtechprojects/meetingRoomApp/data/RoomApi;Lcom/dbtechprojects/meetingRoomApp/database/RoomDAO;)V", "TAG", "", "roomitem", "Lcom/dbtechprojects/meetingRoomApp/util/SingleLiveEvent;", "Lcom/dbtechprojects/meetingRoomApp/data/Resource;", "Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "getRoomitem", "()Lcom/dbtechprojects/meetingRoomApp/util/SingleLiveEvent;", "roomlist", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "getRoomlist", "()Landroidx/lifecycle/MutableLiveData;", "thirtyAgo", "", "getRoomDetails", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRooms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCachedData", "app_debug"})
public final class DefaultRepository {
    private final java.lang.String TAG = "Repo";
    private final long thirtyAgo = 0L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dbtechprojects.meetingRoomApp.data.Resource<java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem>>> roomlist = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dbtechprojects.meetingRoomApp.util.SingleLiveEvent<com.dbtechprojects.meetingRoomApp.data.Resource<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem>> roomitem = null;
    private final com.dbtechprojects.meetingRoomApp.data.RoomApi api = null;
    private final com.dbtechprojects.meetingRoomApp.database.RoomDAO roomDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dbtechprojects.meetingRoomApp.data.Resource<java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem>>> getRoomlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.util.SingleLiveEvent<com.dbtechprojects.meetingRoomApp.data.Resource<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem>> getRoomitem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRoomDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRooms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeCachedData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultRepository(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.data.RoomApi api, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.database.RoomDAO roomDao) {
        super();
    }
}