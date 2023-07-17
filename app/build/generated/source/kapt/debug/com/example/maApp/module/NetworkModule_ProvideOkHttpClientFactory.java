// Generated by Dagger (https://dagger.dev).
package com.example.maApp.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideOkHttpClientFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(contextProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(Provider<Context> contextProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(contextProvider);
  }

  public static OkHttpClient provideOkHttpClient(Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient(context));
  }
}