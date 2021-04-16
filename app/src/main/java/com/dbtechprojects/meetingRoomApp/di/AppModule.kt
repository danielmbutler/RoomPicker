package com.dbtechprojects.meetingRoomApp.di

import android.content.Context
import com.dbtechprojects.meetingRoomApp.data.RoomApi
import com.dbtechprojects.meetingRoomApp.database.RoomDAO
import com.dbtechprojects.meetingRoomApp.database.RoomFinderDatabase
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository
import com.dbtechprojects.meetingRoomApp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


//Hilt Module Class for providing dependencies

    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {

        @Singleton
        @Provides
        fun provideRoomApi(): RoomApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RoomApi::class.java)

        @Provides
        fun provideRoomDao(@ApplicationContext appContext: Context) : RoomDAO {
            return RoomFinderDatabase.getDatabase(appContext).roomDao()
        }



        @Singleton
        @Provides
        fun provideMainRepository(api: RoomApi, dao: RoomDAO) = DefaultRepository(api, dao)





    }
