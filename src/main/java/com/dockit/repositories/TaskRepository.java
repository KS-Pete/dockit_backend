package com.dockit.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.dockit.models.Task;

import antlr.collections.List;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
