package com.example.maApp.di

import android.content.Context
import androidx.room.Room
import com.example.maApp.domain.entity.HomePageItemEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {

    @Provides
    @Singleton
    fun provide(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, MAAppDatabase::class.java, "NOTE_DATABASE")
        .allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideDao(db: MAAppDatabase) = db.noteDoa()

    @Provides
    fun provideEntity() = HomePageItemEntity()


}