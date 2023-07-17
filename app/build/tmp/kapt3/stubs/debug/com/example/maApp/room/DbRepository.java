package com.example.maApp.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/maApp/room/DbRepository;", "", "dao", "Lcom/example/maApp/room/NoteDao;", "(Lcom/example/maApp/room/NoteDao;)V", "deleteNote", "", "note", "Lcom/example/maApp/domain/entity/HomePageItemEntity;", "getAllNotes", "", "getNote", "id", "", "saveNote", "updateNote", "app_debug"})
public final class DbRepository {
    private final com.example.maApp.room.NoteDao dao = null;
    
    @javax.inject.Inject
    public DbRepository(@org.jetbrains.annotations.NotNull
    com.example.maApp.room.NoteDao dao) {
        super();
    }
    
    public final void saveNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity note) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity note) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    com.example.maApp.domain.entity.HomePageItemEntity note) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.maApp.domain.entity.HomePageItemEntity getNote(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.maApp.domain.entity.HomePageItemEntity> getAllNotes() {
        return null;
    }
}