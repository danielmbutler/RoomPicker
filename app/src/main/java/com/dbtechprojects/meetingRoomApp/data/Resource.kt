package com.dbtechprojects.meetingRoomApp.data

//Resource Wrapper class for Objects retrieved from Repository

sealed class Resource<T>(val data: T?, val message: String?) {
    class Success<T>(data: T) : Resource<T>(data, null)
    class Error<T>(message: String) : Resource<T>(null, message)
    class Loading<T>(message: String) : Resource<T>(null, message)
}