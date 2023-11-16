package com.Todo.Todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Todo.model.UserEntities;


public interface UserRepo extends JpaRepository<UserEntities, Integer> {

//    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, value = "user_details_entity_graph")
//    List<UserEntities> findByNameContaining(String text);
}

