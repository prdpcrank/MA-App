// Generated by Dagger (https://dagger.dev).
package com.example.maApp.domain.usecase;

import com.example.maApp.data.repository.MAAppRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetMaAppDataUseCase_Factory implements Factory<GetMaAppDataUseCase> {
  private final Provider<MAAppRepository> repositoryProvider;

  public GetMaAppDataUseCase_Factory(Provider<MAAppRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMaAppDataUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMaAppDataUseCase_Factory create(Provider<MAAppRepository> repositoryProvider) {
    return new GetMaAppDataUseCase_Factory(repositoryProvider);
  }

  public static GetMaAppDataUseCase newInstance(MAAppRepository repository) {
    return new GetMaAppDataUseCase(repository);
  }
}
