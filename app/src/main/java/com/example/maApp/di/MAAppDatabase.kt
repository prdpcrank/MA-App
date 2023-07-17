package com.example.maApp.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.maApp.domain.entity.HomePageItemEntity
import com.example.maApp.room.NoteDao

@Database(entities = [HomePageItemEntity::class], version = 1,exportSchema = false)
abstract class MAAppDatabase : RoomDatabase(){
    abstract  fun noteDoa(): NoteDao
}