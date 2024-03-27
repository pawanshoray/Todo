package com.todo.repository;

import com.todo.model.TodoData;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<TodoData,Id>{
    Optional<TodoData> findById(Long sNo);

}
