package com.example.maApp.room

import com.example.maApp.domain.entity.HomePageItemEntity
import javax.inject.Inject

class DbRepository
@Inject constructor(
    private val dao: NoteDao,
) {

    fun saveNote(note: HomePageItemEntity) = dao.inserNote(note)
    fun updateNote(note: HomePageItemEntity) = dao.updateNote(note)
    fun deleteNote(note: HomePageItemEntity) = dao.deleteNote(note)
    fun getNote(id : Int) : HomePageItemEntity = dao.getNote(id)
    fun getAllNotes() = dao.getAllNotes()

}