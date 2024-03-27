package com.todo.service;

import com.todo.model.TodoData;
import com.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;
    public List<TodoData> getTodo(){
        return repository.findAll();
    }


    public String createTodo(TodoData todoPost) {
        TodoData todo = new TodoData();
        todo.setTodoName(todoPost.getTodoName());
        todo.setTodoTask(todoPost.getTodoTask());
        todo.setTodoStatus(todoPost.getTodoStatus());
        repository.save(todo);
        return "success";
    }

    public String updateTodo(long sNo, TodoData update){
        Optional<TodoData> todo = repository.findById(sNo);
        String name = todo.get().getTodoTask();
        name = "Pawan";
        todo.get().setTodoTask(name);
        repository.save(todo.get());
        return "update Successfully";
    }

    public String deleteTodo(long sNo){
        Optional<TodoData> todo = repository.findById(sNo);
        repository.delete(todo.get());
        return "deleted Successfully";
    }

}
