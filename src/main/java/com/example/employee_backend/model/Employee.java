package com.example.employee_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employe")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private int empCode;
    private String empName;
    private String designstion;
    private int salary;
    private String compName;
    private String mobileNo;
    private String username;
    private String password;

    public Employee() {
    }

    public Employee(int id, int empCode, String empName, String designstion, int salary, String compName, String mobileNo, String username, String password) {
        this.id = id;
        this.empCode = empCode;
        this.empName = empName;
        this.designstion = designstion;
        this.salary = salary;
        this.compName = compName;
        this.mobileNo = mobileNo;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignstion() {
        return designstion;
    }

    public void setDesignstion(String designstion) {
        this.designstion = designstion;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
