package com.example.myapplication;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Studentsrepo {
    private final StudentDao studentDao;
    private final LiveData<List<Students>> allStudents;
    private final ExecutorService executorService;

    public Studentsrepo(Application application) {
        AppDatabase database = AppDatabase.getDatabase(application);
        studentDao = database.studentDao();
        allStudents = studentDao.getAllStudents();
        executorService = Executors.newSingleThreadExecutor();
    }

    public LiveData<List<Students>> getAllStudents() {
        return allStudents;
    }

    public void insert(Students student) {
        executorService.execute(() -> studentDao.insert(student));
    }
}
