package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// DONE (1) make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {

    private final AppDatabase mDb;
    // DONE (2) Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData
    private LiveData<List<TaskEntry>> tasks;


    public MainViewModel(@NonNull Application application) {
        super(application);
        mDb = AppDatabase.getInstance(application.getApplicationContext());
        // DONE (4) In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable
        tasks = mDb.taskDao().loadAllTasks();
    }

    // DONE (3) Create a getter for the tasks variable
    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }
}
