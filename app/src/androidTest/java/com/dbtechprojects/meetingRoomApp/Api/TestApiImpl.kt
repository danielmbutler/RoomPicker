package com.dbtechprojects.meetingRoomApp.Api

import com.dbtechprojects.meetingRoomApp.data.RoomApi
import com.dbtechprojects.meetingRoomApp.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TestApiImpl {
    fun provideRoomApi(): TestApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TestApi::class.java)
}