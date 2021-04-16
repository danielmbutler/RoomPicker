package com.dbtechprojects.meetingRoomApp.database

import androidx.room.*
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import kotlinx.coroutines.flow.Flow


// Database Access Object Class to retrieve details from the Room DB
@Dao
interface RoomDAO {

    @Query("SELECT * FROM roomitems")
    fun getRooms(): List<RoomItem>

    @Query("SELECT * FROM roomdetails WHERE `key` Like :keyid ")
    fun getRoomdetails(keyid: String): RoomDetailsItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRooms(room: List<RoomItem>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertIndividualRoom(room: RoomItem)

    @Query("SELECT * FROM roomitems WHERE id Like :id ")
    fun getIndividualRoom(id: Int): RoomDetailsItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoomDetailItem(roomdetails: RoomDetailsItem)

    @Query("DELETE FROM roomitems")
    suspend fun deleteAllRoomItems()

    @Query("DELETE FROM roomdetails")
    suspend fun deleteAllRoomDetailtems()

}