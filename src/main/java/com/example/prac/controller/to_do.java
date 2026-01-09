package com.example.prac.controller;
import org.springframework.web.bind.annotation.*;
import com.example.prac.model.todos;

@RestController
public class to_do {
    @PostMapping("/create_note")
    public String create_note(@RequestBody todos todo){
        return todo.success();
    }

    @GetMapping("/notes")
    public String[] notes(){
        todos todo = new todos();
        return todo.notes();
    }
}
