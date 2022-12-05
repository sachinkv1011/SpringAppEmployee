package com.example.employee_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

@GetMapping("/")
    public String home(){
        return "welcome home page";
    }

    @PostMapping("/add")
    public String  addEmployee(){
        return "Add employee page";
    }
    @PostMapping("/search")
    public String  searchEmployee(){
        return "Search employee page";
    }
    @PostMapping("/edit")
    public String  editEmployee(){
        return "Edit employee page";
    }
    @GetMapping("/viewall")
    public String  viewEmployee(){
        return "View employee page";
    }
    @PostMapping("/delete")
    public String  deleteEmployee(){
        return "Delete employee page";
    }

}
