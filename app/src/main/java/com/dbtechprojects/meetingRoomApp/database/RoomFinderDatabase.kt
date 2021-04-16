package com.dbtechprojects.meetingRoomApp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dbtechprojects.meetingRoomApp.models.Converters
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem


// Room Database Class
// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(RoomItem::class, RoomDetailsItem::class), version = 3, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RoomFinderDatabase : RoomDatabase() {

    abstract fun roomDao(): RoomDAO

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: RoomFinderDatabase? = null

        fun getDatabase(context: Context): RoomFinderDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomFinderDatabase::class.java,
                    "room_finder"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}