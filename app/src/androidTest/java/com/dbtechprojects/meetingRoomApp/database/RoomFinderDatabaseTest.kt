package com.dbtechprojects.meetingRoomApp.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class RoomFinderDatabaseTest : TestCase() {

    private lateinit var roomFinderDatabase: RoomFinderDatabase
    private lateinit var roomDAO: RoomDAO

    @Before
    public override fun setUp() {
        super.setUp()
        val context = ApplicationProvider.getApplicationContext<Context>()
        roomFinderDatabase = Room.inMemoryDatabaseBuilder(context, RoomFinderDatabase::class.java).build()
        roomDAO = roomFinderDatabase.roomDao()
    }

    @After
    fun closeDb(){
        roomFinderDatabase.close()
    }

    @Test
    fun insertRoomItem(){
        val roomItem = RoomItem(id = 9898)
        roomDAO.insertIndividualRoom(roomItem)

        val roomItemRetrieve = roomDAO.getIndividualRoom(9898)
        assertEquals(roomItemRetrieve != null, true)

    }

    @Test
    fun insertRoomDetailsItem() = runBlocking{

        val roomItem = RoomDetailsItem(99 , key = "9898")

        roomDAO.insertRoomDetailItem(roomItem)

        val roomItemRetrieve = roomDAO.getRoomdetails("9898")
        assertEquals(roomItemRetrieve != null, true)
    }

}