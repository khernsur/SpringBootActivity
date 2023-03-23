package com.example.SpringBootActivity;

import java.util.List;

public interface TaskService {
    List< Task> getAllTask();
    void saveTask(Task task);
    Task getTaskById(long id);
    void deleteTaskById(long id);
}
