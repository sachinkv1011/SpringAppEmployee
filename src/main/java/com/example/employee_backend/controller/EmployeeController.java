package com.example.employee_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

@GetMapping("/")
    public String home(){
        return "welcome home page";
    }

    @GetMapping("/add")
    public String  addEmployee(){
        return "Add employee page";
    }
    @GetMapping("/serach")
    public String  searchEmployee(){
        return "Search employee page";
    }

}
