package com.dbtechprojects.meetingRoomApp.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

// Model class for Room Item
@Parcelize
@Entity(tableName = "RoomItems", indices = (arrayOf(Index(value = arrayOf("key"), unique = true)))) // make key unique to stop duplicate room entries into DB
data class RoomItem(
@PrimaryKey
val id: Int?,

@ColumnInfo(name = "capacity")
@SerializedName("capacity")
val capacity: Int? = null,

@ColumnInfo(name = "key")
@SerializedName("key")
val key: String? = null,

@ColumnInfo(name = "name")
@SerializedName("name")
val name: String? = null,

@ColumnInfo(name = "thumbnailUrl")
@SerializedName("thumbnailUrl")
val thumbnailUrl: String? = null,

@ColumnInfo(name = "timestamp")
@SerializedName("timestamp")
var timestamp: String? = null  // additional value needed to invalidate cache
): Parcelable


