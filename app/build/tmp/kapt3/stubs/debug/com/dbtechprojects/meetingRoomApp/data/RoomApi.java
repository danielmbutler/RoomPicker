package com.dbtechprojects.meetingRoomApp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/data/RoomApi;", "", "getRoomDetails", "Lretrofit2/Response;", "Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRooms", "", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RoomApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/room/rooms.json")
    public abstract java.lang.Object getRooms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/room/detail/{key}.json")
    public abstract java.lang.Object getRoomDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem>> p1);
}