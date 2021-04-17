package com.dbtechprojects.meetingRoomApp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dbtechprojects.meetingRoomApp.repository.TestRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TestViewModel(private val repository: TestRepository) : ViewModel() {

    val roomlist = repository.roomlist

    fun getRooms() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getRooms()
        }
    }
}