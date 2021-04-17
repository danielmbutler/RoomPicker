package com.dbtechprojects.meetingRoomApp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.dbtechprojects.meetingRoomApp.data.Resource
import com.dbtechprojects.meetingRoomApp.data.RoomApi
import com.dbtechprojects.meetingRoomApp.database.RoomDAO
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.util.Constants
import com.dbtechprojects.meetingRoomApp.util.SingleLiveEvent
import javax.inject.Inject



// Repository class to return objects to viewmodels

class DefaultRepository  @Inject constructor(
    private val api: RoomApi,
    private val roomDao: RoomDAO,
)  {
    private val TAG = "Repo"
    private val thirtyAgo = System.currentTimeMillis() - Constants.CACHE

    //MutableLiveData Object
    val roomlist = MutableLiveData<Resource<List<RoomItem>>>()
    val roomitem = SingleLiveEvent<Resource<RoomDetailsItem>>() // single live event to stop stale items being stored in Live Data




    // Single Source of Truth function
    // retrieve rooms from DB if empty retrieve rooms from api
    // if timestamp expired retrieve from api, insert results to db , updated timestamps and return items from db


    suspend fun getRoomDetails(key: String){
        //post loading back to ui
        roomitem.postValue(Resource.Loading("Loading"))


        // get results from DB
        val roomDetailsItemFromDB = roomDao.getRoomdetails(key)

        if (roomDetailsItemFromDB != null){
            //if cache is older than 30 mins ago lets check the api
            if (roomDetailsItemFromDB.timestamp?.toLong()!! < thirtyAgo){
                Log.d(TAG, "CACHE EXPIRED, GETTING ROOMS FROM API")
                val res = api.getRoomDetails(key)
                if (res.isSuccessful && res.body() != null ){

                    // add timestamp
                    res.body()!!.timestamp = System.currentTimeMillis().toString()

                    roomDao.insertRoomDetailItem(res.body()!!)
                    val newitems = roomDao.getRoomdetails(key)
                    if (newitems != null){
                        roomitem.postValue(Resource.Success(newitems))
                    }


                } else{
                    //Api Failure
                    return roomitem.postValue(Resource.Error("No Api Response"))
                }
            } else
            {   // Cache not expired return results from DB
                return roomitem.postValue(Resource.Success(roomDetailsItemFromDB))
            }

        } else {

            // no results from DB lets check the API

            val res = api.getRoomDetails(key)
            if (res.isSuccessful){

                // add timestamp
                res.body()?.timestamp = System.currentTimeMillis().toString()

                // insert successful DB entries

                res.body()?.let { roomDao.insertRoomDetailItem(it) }

                val newitems = roomDao.getRoomdetails(key)
                if (newitems != null){
                    roomitem.postValue(Resource.Success(newitems))
                }

            } else{
                //API ERROR
                return roomitem.postValue(Resource.Error("No Api Response" ))
            }

        }

    }


    // Single Source of Truth function
    // retrieve rooms from DB if empty retrieve rooms from api
    // if timestamp expired retrieve from api, insert results to db , updated timestamps and return items from db

    suspend fun getRooms() {

        //post loading back to ui
        roomlist.postValue(Resource.Loading("Loading"))

        // get results from DB
        val roomsFromDB = roomDao.getRooms()

        if (roomsFromDB.isNotEmpty()){
            if (roomsFromDB[0].timestamp != null){
                //if cache is older than 30 mins ago lets check the api
                if (roomsFromDB[0].timestamp?.toLong()!! < thirtyAgo){
                    Log.d(TAG, "CACHE EXPIRED, GETTINGS ROOMS FROM API")
                    val res = api.getRooms()
                    if (res.isSuccessful && res.body()?.isNotEmpty() == true){

                        // add timestamp
                        for (i in res.body()!!){
                            i.timestamp = System.currentTimeMillis().toString()
                        }
                        roomDao.insertRooms(res.body()!!)
                        roomlist.postValue(Resource.Success(roomDao.getRooms()))

                    } else{
                        //Api Failure
                        return roomlist.postValue(Resource.Error("No Api Response"))
                    }
                } else
                {
                    // Cache not expired return results from DB
                    return roomlist.postValue(Resource.Success(roomsFromDB))
                }

            } else {
                val res = api.getRooms()
                if (res.isSuccessful && res.body()?.isNotEmpty() == true ){
                    val res = api.getRooms()
                    // add timestamp
                    for (i in res.body()!!){
                        i.timestamp = System.currentTimeMillis().toString()
                    }
                    // insert successful DB entries
                    roomDao.insertRooms(res.body()!!)
                    return roomlist.postValue(Resource.Success(roomDao.getRooms()))

                } else{
                    //API FAILURE
                    return roomlist.postValue(Resource.Error("No Api Response" ))
                }

            }

        } else {
            // no results from DB lets check the API
            Log.d(TAG, "ROOM DB is Empty, GETTING ROOMS FROM API")
            val res = api.getRooms()
            if (res.isSuccessful && res.body()?.isNotEmpty() == true){

                // add timestamp
                for (i in res.body()!!){
                    i.timestamp = System.currentTimeMillis().toString()
                }
                roomDao.insertRooms(res.body()!!)
                roomlist.postValue(Resource.Success(roomDao.getRooms()))

            } else{
                return roomlist.postValue(Resource.Error("No Api Response"))
            }
        }



        }


    // remove all data in roomDB

    suspend fun removeCachedData(){
        roomDao.deleteAllRoomDetailtems()
        roomDao.deleteAllRoomItems()
    }



}