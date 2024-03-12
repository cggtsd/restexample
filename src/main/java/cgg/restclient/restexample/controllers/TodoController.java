package cgg.restclient.restexample.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.restclient.restexample.model.Todo;
import cgg.restclient.restexample.services.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // get single todo with id
    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id) {
        return this.todoService.getTodo(id);
    }

    // get todos
    @GetMapping("/")
    public List<Todo> getTodos() {
        return this.todoService.getTodos();
    }

    @PostMapping("/")
    public Todo createTodo(@RequestBody Todo todo) {
        return this.todoService.createTodo(todo);
    }
}
