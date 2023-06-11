package com.dockit.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dockit.models.Task;

import antlr.collections.List;

@Repository	
public interface TaskRepository extends CrudRepository<Task, Integer>{
    
}
