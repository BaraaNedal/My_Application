package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Students {
    @PrimaryKey(autoGenerate = true)
    public int id;
    
    public String name;
}
