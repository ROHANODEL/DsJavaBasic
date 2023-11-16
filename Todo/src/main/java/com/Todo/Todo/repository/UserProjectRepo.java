package com.Todo.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Todo.model.UserProjectXref;

public interface UserProjectRepo extends JpaRepository<UserProjectXref, Integer> {

}
