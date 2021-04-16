package com.dbtechprojects.meetingRoomApp.ui.viewmodels


import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.dbtechprojects.meetingRoomApp.data.Resource
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

private const val TAG = "RoomListViewModel"
class RoomListViewModel @ViewModelInject constructor(
    private val repository: DefaultRepository,
) : ViewModel() {

    val roomlist = repository.roomlist

    fun getRooms() {
        viewModelScope.launch(Dispatchers.IO) {
          repository.getRooms()
        }
    }

    fun deleteCachedData(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.removeCachedData()
        }
    }
}