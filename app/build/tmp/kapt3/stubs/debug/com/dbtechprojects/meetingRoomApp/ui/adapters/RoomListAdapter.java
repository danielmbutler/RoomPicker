package com.dbtechprojects.meetingRoomApp.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/ui/adapters/RoomListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dbtechprojects/meetingRoomApp/ui/adapters/RoomItemViewHolder;", "()V", "onClickListener", "Lcom/dbtechprojects/meetingRoomApp/ui/adapters/RoomListAdapter$OnClickListener;", "roomlist", "", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "setlist", "list", "OnClickListener", "app_debug"})
public final class RoomListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dbtechprojects.meetingRoomApp.ui.adapters.RoomItemViewHolder> {
    private com.dbtechprojects.meetingRoomApp.ui.adapters.RoomListAdapter.OnClickListener onClickListener;
    private java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem> roomlist;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dbtechprojects.meetingRoomApp.ui.adapters.RoomItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.ui.adapters.RoomItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.ui.adapters.RoomListAdapter.OnClickListener onClickListener) {
    }
    
    public final void setlist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dbtechprojects.meetingRoomApp.models.RoomItem> list) {
    }
    
    public RoomListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/ui/adapters/RoomListAdapter$OnClickListener;", "", "onClick", "", "position", "", "model", "Lcom/dbtechprojects/meetingRoomApp/models/RoomItem;", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int position, @org.jetbrains.annotations.NotNull()
        com.dbtechprojects.meetingRoomApp.models.RoomItem model, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
}