package com.dbtechprojects.meetingRoomApp.ui.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

const val VTAG = "RoomDetailViewModel"
class RoomDetailViewModel @ViewModelInject constructor(
    private val repository: DefaultRepository,
) : ViewModel() {
    init {
        Log.i("ViewModel", "ViewModel created!")

    }

    val roomdetails = repository.roomitem

    fun getRoomDetails(key: String){
        viewModelScope.launch(Dispatchers.IO) {
           repository.getRoomDetails(key)

        }

    }


}