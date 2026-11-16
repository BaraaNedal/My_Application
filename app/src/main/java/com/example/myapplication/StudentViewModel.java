package com.example.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {
    private final Studentsrepo repository;
    private final LiveData<List<Students>> allStudents;

    public StudentViewModel(@NonNull Application application) {
        super(application);
        repository = new Studentsrepo(application);
        allStudents = repository.getAllStudents();
    }

    public LiveData<List<Students>> getAllStudents() {
        return allStudents;
    }

    public void insert(Students student) {
        repository.insert(student);
    }
}
