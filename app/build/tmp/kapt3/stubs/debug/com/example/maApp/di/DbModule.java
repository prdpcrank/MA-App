package com.example.maApp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/maApp/di/DbModule;", "", "()V", "provide", "Lcom/example/maApp/di/MAAppDatabase;", "context", "Landroid/content/Context;", "provideDao", "Lcom/example/maApp/room/NoteDao;", "db", "provideEntity", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "app_debug"})
@dagger.Module
public final class DbModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.maApp.di.DbModule INSTANCE = null;
    
    private DbModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.maApp.di.MAAppDatabase provide(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.maApp.room.NoteDao provideDao(@org.jetbrains.annotations.NotNull
    com.example.maApp.di.MAAppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.maApp.domain.entity.HomePageItemEntity provideEntity() {
        return null;
    }
}