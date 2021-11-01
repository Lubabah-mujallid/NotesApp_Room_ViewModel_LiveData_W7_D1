package com.example.notesapp_room_viewmodel_livedata_w7_d1.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDAO {
    @Query("SELECT * FROM NOTES ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

}