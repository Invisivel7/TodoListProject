package com.invisivel.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invisivel.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
