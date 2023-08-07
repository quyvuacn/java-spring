package com.example.springschool.service;

import com.example.springschool.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;



public interface EmployeeService {
    List<Employee> findByName(String name);
    Employee create(Employee employeeDto);
}
