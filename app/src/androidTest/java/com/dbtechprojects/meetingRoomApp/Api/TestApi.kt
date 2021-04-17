package com.dbtechprojects.meetingRoomApp.Api

import com.dbtechprojects.meetingRoomApp.models.RoomItem
import retrofit2.Response
import retrofit2.http.GET

interface TestApi {
    @GET("/api/room/rooms.json")
    suspend fun getRooms(
    ): List<RoomItem>
}