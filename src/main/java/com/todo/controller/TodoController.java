package com.todo.controller;

import com.todo.model.TodoData;
import com.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class TodoController{

    private TodoService service ;
    @GetMapping("/todo")
    public List<TodoData> findAllTodo(){
        return service.getTodo();
    }

    @PostMapping("/todo")
    public String createTodo(@RequestBody TodoData todoPost){
        return service.createTodo(todoPost);
    }
    @PutMapping("/todo/{sNo}")
    public String updateEmployee(@PathVariable long sNo, @RequestBody TodoData todoDetails) {
        return service.updateTodo(sNo,todoDetails);
    }
    @DeleteMapping("/todo/{sNo}")
    public String deleteTodo(@PathVariable long sNo){
        return service.deleteTodo(sNo);
    }
}


