package com.example.notesapp_room_viewmodel_livedata_w7_d1.data

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDAO) {

    val getNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    fun addNote(note: Note){
        noteDao.insertNote(note)
    }

    fun updateNote(note: Note){
        noteDao.updateNote(note)
    }

    fun deleteNote(note: Note){
        noteDao.deleteNote(note)
    }

}