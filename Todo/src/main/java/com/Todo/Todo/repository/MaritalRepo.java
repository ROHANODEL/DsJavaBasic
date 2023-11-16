package com.Todo.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Todo.model.MaritalStatusEntities;

public interface MaritalRepo extends JpaRepository<MaritalStatusEntities, Integer>{

}
