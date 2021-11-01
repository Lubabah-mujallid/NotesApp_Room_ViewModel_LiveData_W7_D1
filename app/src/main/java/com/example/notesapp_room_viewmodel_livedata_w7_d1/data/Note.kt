package com.example.notesapp_room_viewmodel_livedata_w7_d1.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "NOTES")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text: String
)