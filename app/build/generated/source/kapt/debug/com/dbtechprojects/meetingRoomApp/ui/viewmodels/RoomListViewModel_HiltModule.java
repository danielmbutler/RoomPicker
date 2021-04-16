package com.dbtechprojects.meetingRoomApp.ui.viewmodels;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = RoomListViewModel.class
)
public interface RoomListViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dbtechprojects.meetingRoomApp.ui.viewmodels.RoomListViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(RoomListViewModel_AssistedFactory factory);
}
