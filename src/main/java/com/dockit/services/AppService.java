package com.dockit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockit.models.Task;
import com.dockit.repositories.TaskRepository;

@Service
public class AppService {
    @Autowired
    TaskRepository taskRepo;

    public List<Task> getAllTasks(){
        List<Task> tasks = new ArrayList<>();
        taskRepo.findAll().forEach(task -> tasks.add(task));
        return tasks;
    }

    public void saveOrUpdate(Task task){
        taskRepo.save(task);
    }
}
