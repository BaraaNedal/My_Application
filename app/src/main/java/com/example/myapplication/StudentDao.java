package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void insert(Students student);

    @Query("SELECT * FROM students")
    LiveData<List<Students>> getAllStudents();
}
