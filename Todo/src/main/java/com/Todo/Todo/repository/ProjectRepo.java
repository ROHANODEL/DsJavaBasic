package com.Todo.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Todo.model.ProjectEntities;


public interface ProjectRepo extends JpaRepository<ProjectEntities, Integer>{

}
