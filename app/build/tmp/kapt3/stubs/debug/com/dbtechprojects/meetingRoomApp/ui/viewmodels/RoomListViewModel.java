package com.dbtechprojects.meetingRoomApp.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/ui/viewmodels/RoomListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;", "(Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;)V", "roomlist", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dbtechprojects/meetingRoomApp/data/Resource;", "", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "getRoomlist", "()Landroidx/lifecycle/MutableLiveData;", "deleteCachedData", "", "getRooms", "app_debug"})
public final class RoomListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dbtechprojects.meetingRoomApp.data.Resource<java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem>>> roomlist = null;
    private final com.dbtechprojects.meetingRoomApp.repository.DefaultRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dbtechprojects.meetingRoomApp.data.Resource<java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem>>> getRoomlist() {
        return null;
    }
    
    public final void getRooms() {
    }
    
    public final void deleteCachedData() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RoomListViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.repository.DefaultRepository repository) {
        super();
    }
}