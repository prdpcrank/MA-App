package com.example.maApp.room

import androidx.room.*
import com.example.maApp.domain.entity.HomePageItemEntity
@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserNote(noteEntity: HomePageItemEntity)

    @Update
    fun updateNote(noteEntity: HomePageItemEntity)

    @Delete
    fun deleteNote(noteEntity: HomePageItemEntity)

    @Query("select * from appTable")
    fun getAllNotes() : MutableList<HomePageItemEntity>


    @Query("SELECT * FROM appTable WHERE id LIKE :id")
    fun getNote(id : Int) : HomePageItemEntity

}