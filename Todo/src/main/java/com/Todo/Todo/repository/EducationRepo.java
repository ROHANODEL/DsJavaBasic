package com.Todo.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Todo.model.EducationEntities;

public interface EducationRepo extends JpaRepository<EducationEntities, Integer> {

}
