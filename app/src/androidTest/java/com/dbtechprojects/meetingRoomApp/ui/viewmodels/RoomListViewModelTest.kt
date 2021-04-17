package com.dbtechprojects.meetingRoomApp.ui.viewmodels

import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dbtechprojects.meetingRoomApp.Api.TestApi
import com.dbtechprojects.meetingRoomApp.Api.TestApiImpl
import com.dbtechprojects.meetingRoomApp.data.RoomApi
import com.dbtechprojects.meetingRoomApp.database.RoomFinderDatabase
import com.dbtechprojects.meetingRoomApp.di.AppModule
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository
import com.dbtechprojects.meetingRoomApp.repository.TestRepository
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import retrofit2.Retrofit
import java.io.IOException





@RunWith(AndroidJUnit4::class)
class RoomListViewModelTest : TestCase() {

    private lateinit var roomItemsDatabase: RoomFinderDatabase
    private lateinit var viewModel: TestViewModel

    private lateinit var api: TestApi



    // A JUnit Test Rule that swaps the background executor used by the Architecture Components with a different one which executes each task synchronously.
    // stops the "cannot observeForever on a background thread" error
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    public override fun setUp() {

        // setup database
        val context = ApplicationProvider.getApplicationContext<Context>()
        roomItemsDatabase = Room.inMemoryDatabaseBuilder(
            context, RoomFinderDatabase::class.java
        ).allowMainThreadQueries().build()

        //setup api
        api = TestApiImpl.provideRoomApi()
        val dataSource = TestRepository(api = api, roomItemsDatabase.roomDao())
        viewModel = TestViewModel(dataSource)
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        roomItemsDatabase.close()
    }

    @Test
    fun testRetrievingRooms() {
        viewModel.getRooms()
        val result = viewModel.roomlist.getOrAwaitValue()
        println("test ${result.toString()}")
        println("test ${result[0].toString()}")

        // test result is not empty from repository
        assertEquals(result.isNotEmpty(), true)
        // confirm that result has a room
        assertEquals(result[0].key?.isNotEmpty(), true)


    }
}