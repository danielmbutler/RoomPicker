package com.dbtechprojects.meetingRoomApp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/dbtechprojects/meetingRoomApp/di/AppModule;", "", "()V", "provideMainRepository", "Lcom/dbtechprojects/meetingRoomApp/repository/DefaultRepository;", "api", "Lcom/dbtechprojects/meetingRoomApp/data/RoomApi;", "dao", "Lcom/dbtechprojects/meetingRoomApp/database/RoomDAO;", "provideRoomApi", "provideRoomDao", "appContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.dbtechprojects.meetingRoomApp.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.dbtechprojects.meetingRoomApp.data.RoomApi provideRoomApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.dbtechprojects.meetingRoomApp.database.RoomDAO provideRoomDao(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.dbtechprojects.meetingRoomApp.repository.DefaultRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.data.RoomApi api, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.meetingRoomApp.database.RoomDAO dao) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}