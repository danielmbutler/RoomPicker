package com.dbtechprojects.meetingRoomApp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.dbtechprojects.meetingRoomApp.Api.TestApi
import com.dbtechprojects.meetingRoomApp.data.Resource
import com.dbtechprojects.meetingRoomApp.database.RoomDAO
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.util.Constants

class TestRepository(private val api: TestApi, private val roomDao: RoomDAO) {

    private val thirtyAgo = System.currentTimeMillis() - Constants.CACHE

    //MutableLiveData Object
    val roomlist = MutableLiveData<List<RoomItem>>()

    suspend fun getRooms() {


        // get results from DB
        val roomsFromDB = roomDao.getRooms()

        if (roomsFromDB.isNotEmpty()){
            if (roomsFromDB[0].timestamp != null){
                //if cache is older than 30 mins ago lets check the api
                if (roomsFromDB[0].timestamp?.toLong()!! < thirtyAgo){

                    val res = api.getRooms()
                    if (res.isNotEmpty()){

                        // add timestamp
                        for (i in res){
                            i.timestamp = System.currentTimeMillis().toString()
                        }
                        roomDao.insertRooms(res)
                        roomlist.postValue(roomDao.getRooms())

                    } else{
                        //Api Failure
                        return roomlist.postValue(emptyList())
                    }
                } else
                {
                    // Cache not expired return results from DB
                    return roomlist.postValue(roomsFromDB)
                }

            } else {
                val res = api.getRooms()
                if (res.isNotEmpty()){
                    val res = api.getRooms()
                    // add timestamp
                    for (i in res){
                        i.timestamp = System.currentTimeMillis().toString()
                    }
                    // insert successful DB entries
                    roomDao.insertRooms(res)
                    return roomlist.postValue(roomDao.getRooms())

                } else{
                    //API FAILURE
                    return roomlist.postValue(emptyList())
                }

            }

        } else {
            // no results from DB lets check the API

            val res = api.getRooms()
            if (res.isNotEmpty()){

                // add timestamp
                for (i in res){
                    i.timestamp = System.currentTimeMillis().toString()
                }
                roomDao.insertRooms(res)
                roomlist.postValue(roomDao.getRooms())

            } else{
                return roomlist.postValue(emptyList())
            }
        }



    }
}