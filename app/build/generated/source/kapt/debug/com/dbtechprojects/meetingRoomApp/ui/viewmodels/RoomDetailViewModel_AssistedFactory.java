package com.dbtechprojects.meetingRoomApp.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dbtechprojects.meetingRoomApp.repository.DefaultRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class RoomDetailViewModel_AssistedFactory implements ViewModelAssistedFactory<RoomDetailViewModel> {
  private final Provider<DefaultRepository> repository;

  @Inject
  RoomDetailViewModel_AssistedFactory(Provider<DefaultRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public RoomDetailViewModel create(SavedStateHandle handle) {
    return new RoomDetailViewModel(repository.get());
  }
}
