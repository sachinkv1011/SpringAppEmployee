package com.example.employee_backend.controller;


import com.example.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

@GetMapping("/")
    public String home(){
        return "welcome employee home page";
    }

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String  addEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpName().toString());
        System.out.println(e.getEmpCode());
        System.out.println(e.getDesignstion().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        return "Add employee successfully";
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
