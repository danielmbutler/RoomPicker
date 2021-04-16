package com.dbtechprojects.meetingRoomApp.data

import androidx.lifecycle.LiveData
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


// API Interface class to retrieve Room Items and Room Details

interface RoomApi {

    @GET("/api/room/rooms.json")
   suspend fun getRooms(
    ): Response<List<RoomItem>>

    @GET("/api/room/detail/{key}.json")
    suspend fun getRoomDetails(
            @Path("key") key: String,
    ): Response<RoomDetailsItem>
}

//Base Url
//"https://ssgmobile.github.io"

// GET Room
//https://ssgmobile.github.io/api/room/rooms.json

//GET RoomDetails
//https://ssgmobile.github.io/api/room/detail/0001.json
