package com.dockit.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Task updateTask(Integer id, Task task) {
        Optional<Task> taskOpt = getAllTasks()
            .stream()
            .filter(item -> item.getId() == id)
            .findAny();

        if (taskOpt.isPresent()){
            Task item = taskOpt.get();
            item.setIsdone(task.getIsdone());
            item.setText(task.getText());
            item.setTitle(task.getTitle());
            item.setDate(task.getDate());
            saveOrUpdate(item);
            return item;
        }

        return null;
    }

    public void deleteTask(int id) {
        taskRepo.deleteById(id);
    }
}
