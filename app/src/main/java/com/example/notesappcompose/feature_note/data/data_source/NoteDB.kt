package com.example.notesappcompose.feature_note.data.data_source

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notesappcompose.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDB : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object{
        const val DB_NAME = "notes_db"
    }
}