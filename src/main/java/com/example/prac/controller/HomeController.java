package com.example.prac.controller;
import org.springframework.web.bind.annotation.*;
import com.example.prac.model.User;


@RestController
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/mul/{num}")
    public int mul(@PathVariable int num){
        return num*num;
    }

    @GetMapping("/add")
    public int add(@RequestParam int n){
        return n+n;
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hello" +name;
    }

    @PostMapping("/users")
    public String user(@RequestBody User user){
        return "Name is: " + user.name + ", Age is: " + user.age;
    }
}