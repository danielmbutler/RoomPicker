package com.dbtechprojects.meetingRoomApp.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/ui/viewmodels/RoomDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;", "(Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;)V", "roomdetails", "Lcom/dbtechprojects/meetingRoomApp/util/SingleLiveEvent;", "Lcom/dbtechprojects/meetingRoomApp/data/Resource;", "Lcom/dbtechprojects/meetingRoomApp/models/RoomDetailsItem;", "getRoomdetails", "()Lcom/dbtechprojects/meetingRoomApp/util/SingleLiveEvent;", "getRoomDetails", "", "key", "", "app_debug"})
public final class RoomDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.dbtechprojects.meetingRoomApp.util.SingleLiveEvent<com.dbtechprojects.meetingRoomApp.data.Resource<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem>> roomdetails = null;
    private final com.dbtechprojects.meetingRoomApp.repository.DefaultRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.meetingRoomApp.util.SingleLiveEvent<com.dbtechprojects.meetingRoomApp.data.Resource<com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem>> getRoomdetails() {
        return null;
    }
    
    public final void getRoomDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RoomDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.repository.DefaultRepository repository) {
        super();
    }
}