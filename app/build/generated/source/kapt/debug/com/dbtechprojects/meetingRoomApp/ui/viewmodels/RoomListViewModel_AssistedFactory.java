package com.dbtechprojects.meetingRoomApp.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class RoomListViewModel_AssistedFactory implements ViewModelAssistedFactory<RoomListViewModel> {
  private final Provider<DefaultRepository> repository;

  @Inject
  RoomListViewModel_AssistedFactory(Provider<DefaultRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public RoomListViewModel create(SavedStateHandle handle) {
    return new RoomListViewModel(repository.get());
  }
}
