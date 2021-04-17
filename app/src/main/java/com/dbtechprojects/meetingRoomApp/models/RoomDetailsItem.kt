package com.dbtechprojects.meetingRoomApp.models

import android.os.Parcelable
import androidx.room.*
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import kotlinx.parcelize.Parcelize


// model class for Room_Details_Item and RoomDB Table Setup

@Parcelize   // make Room Key  unique to stop duplicate Rooms
@Entity(
    tableName = "roomdetails", indices = (arrayOf(Index(value = arrayOf("key"), unique = true)))
)

data class RoomDetailsItem(
    @PrimaryKey
    val Roomid: Int?,

    @ColumnInfo(name = "capacity")
    @SerializedName("capacity")
    val capacity: Int? = null,

    @ColumnInfo(name = "equipment")
    @SerializedName("equipment")
     val equipment: List<Equipment>? =null,

    @ColumnInfo(name = "facilities")
    @SerializedName("facilities")
    val facilities: List<Facility>? = null,

    @ColumnInfo(name = "features")
    @SerializedName("features")
    val features: List<Feature>? = null,

    @ColumnInfo(name = "heroImageUrl")
    @SerializedName("heroImageUrl")
    val heroImageUrl: String? = null,

    @ColumnInfo(name = "key")
    @SerializedName("key")
    val key: String? = null,


    @SerializedName("location")
    @Embedded // multiple child objects which requires @Embedded
    val location: Location? = null,
    val name: String? = null,

    @ColumnInfo(name = "services")
    @SerializedName("services")
    val services: List<Service>? = null,

    @ColumnInfo(name = "timestamp")
    @SerializedName("timestamp")
    var timestamp: String? = "" // additional value needed to invalidate cache

): Parcelable


@Parcelize
data class Equipment(
    val iconUrl: String,
    @SerializedName("key")
    val equipmentkey: String,
    val name: String
): Parcelable


@Parcelize
data class Facility(
    val iconUrl: String,
    @SerializedName("key")
    val facilitykey: String,
    val name: String
): Parcelable

@Parcelize
data class Feature(
    @SerializedName("key")
    val featurekey: String,
    val name: String
): Parcelable

@Parcelize
data class Service(
    val iconUrl: String,
    @SerializedName("key")
    val servicekey: String,
    val name: String
): Parcelable

@Parcelize
data class Location(
    @Embedded
    val building: Building,
    @Embedded
    val floor: Floor,
    @Embedded
    val region: Region,
    @Embedded
    val site: Site
): Parcelable



@Parcelize
data class Building(
    @SerializedName("key")
    val buildingkey: String? = null,
    @SerializedName("name")
    val buildingname: String? = null
): Parcelable

@Parcelize
data class Floor(
    @SerializedName("key")
    val floorkey: String? = null,
    @SerializedName("name")
    val floorname: String? = null
): Parcelable

@Parcelize
data class Region(
    @SerializedName("key")
    val regionkey: String? = null,
    @SerializedName("name")
    val regionname: String? = null
): Parcelable

@Parcelize
data class Site(
    @SerializedName("key")
    val sitekey: String? = null,
    @SerializedName("name")
    val sitename: String? = null
): Parcelable


//Type converters for custom room detail objects

//TODO object ??
class Converters {
    @TypeConverter
    fun fromEquipmentList(list: List<Equipment?>?): String? {
        val type = object : TypeToken<List<Equipment>>() {}.type
        return Gson().toJson(list, type)
    }
    @TypeConverter
    fun toEquipmentList(list: String?): List<Equipment>? {
        val type = object : TypeToken<List<Equipment>>() {}.type
        return Gson().fromJson<List<Equipment>>(list, type)
    }

    @TypeConverter
    fun fromFacilitiesList(list: List<Facility?>?): String? {
        val type = object : TypeToken<List<Facility>>() {}.type
        return Gson().toJson(list, type)
    }
    @TypeConverter
    fun toFacilitiesList(list: String?): List<Facility>? {
        val type = object : TypeToken<List<Facility>>() {}.type
        return Gson().fromJson<List<Facility>>(list, type)
    }

    @TypeConverter
    fun fromFeatureList(list: List<Feature?>?): String? {
        val type = object : TypeToken<List<Feature>>() {}.type
        return Gson().toJson(list, type)
    }
    @TypeConverter
    fun toFeatureList(list: String?): List<Feature>? {
        val type = object : TypeToken<List<Feature>>() {}.type
        return Gson().fromJson<List<Feature>>(list, type)
    }

    @TypeConverter
    fun fromServiceList(list: List<Service?>?): String? {
        val type = object : TypeToken<List<Service>>() {}.type
        return Gson().toJson(list, type)
    }
    @TypeConverter
    fun toServiceList(list: String?): List<Service>? {
        val type = object : TypeToken<List<Service>>() {}.type
        return Gson().fromJson<List<Service>>(list, type)
    }




}