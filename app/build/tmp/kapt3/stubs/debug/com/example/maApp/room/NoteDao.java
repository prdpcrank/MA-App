package com.example.maApp.room;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/maApp/room/NoteDao;", "", "deleteNote", "", "noteEntity", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "getAllNotes", "", "getNote", "id", "", "inserNote", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void inserNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity noteEntity);
    
    @androidx.room.Update
    public abstract void updateNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity noteEntity);
    
    @androidx.room.Delete
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity noteEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from appTable")
    public abstract java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> getAllNotes();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM appTable WHERE id LIKE :id")
    public abstract com.example.maApp.domain.entity.HomePageItemEntity getNote(int id);
}