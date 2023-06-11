package com.dockit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockit.models.Task;
import com.dockit.services.AppService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class TaskController {

@Autowired
AppService appService;

@GetMapping("/tasks")
public List<Task> getAllTasks(){
    return appService.getAllTasks();
}
@PostMapping("/tasks")
public int createTask(@RequestBody Task task){
    appService.saveOrUpdate(task);
    return task.getId();
}

@PutMapping(value="/tasks/{id}")
public Task saveTask(@PathVariable Integer id, @RequestBody Task task) {
    return appService.updateTask(id, task);
}

@DeleteMapping(value="/tasks/{id}")
public int deleteTask(@PathVariable Integer id) {
    appService.deleteTask(id);
    return id;
}

}