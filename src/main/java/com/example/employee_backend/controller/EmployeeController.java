package com.example.employee_backend.controller;


import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")

    @GetMapping("/")
    public String home(){
        return "welcome employee home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String  addEmployee(@RequestBody Employee e)
     {
        System.out.println(e.getEmpName().toString());
        System.out.println(e.getEmpCode());
        System.out.println(e.getDesignstion().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);

        return "Add employee successfully";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Employee>  searchEmployee(@RequestBody Employee e){
        String empCode= String.valueOf(e.getEmpCode());
        System.out.println(empCode);
        return (List<Employee>) dao.searchEmployee(e.getEmpCode());
    }
    @PostMapping("/edit")
    public String  editEmployee(){
        return "Edit employee page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employee> viewEmployee(){
        return (List<Employee>) dao.findAll();
    }
    @PostMapping("/delete")
    public String  deleteEmployee(){
        return "Delete employee page";
    }

}
