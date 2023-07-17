package com.example.maApp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NasaApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NasaApplication_GeneratedInjector {
  void injectNasaApplication(NasaApplication nasaApplication);
}
