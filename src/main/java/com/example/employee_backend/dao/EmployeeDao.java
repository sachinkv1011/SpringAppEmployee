package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value="SELECT `id`, `comp_name`, `designstion`, `emp_code`, `emp_name`, `mobile_no`, `password`, `salary`, `username` FROM `employe` WHERE `emp_code`= :empCode",nativeQuery = true)
    List<Employee> searchEmployee( Integer empCode);
}
