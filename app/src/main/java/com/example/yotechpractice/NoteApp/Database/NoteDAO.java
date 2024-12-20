package com.example.yotechpractice.NoteApp.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.yotechpractice.NoteApp.Model.Notes;

import java.util.List;

@Dao
public interface NoteDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Notes notes);

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();

    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);

    @Delete
    void delete(Notes notes);

}
