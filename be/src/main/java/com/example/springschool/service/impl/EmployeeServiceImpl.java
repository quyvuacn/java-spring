package com.example.springschool.service.impl;

import com.example.springschool.entity.Employee;
import com.example.springschool.repo.EmployeeRepository;
import com.example.springschool.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> findByName(String name) {
        if(name == ""){
            return  repo.findAll();
        }
        return repo.findEmployeeByName(name);
    }

    @Override
    public Employee create(Employee employee) {
        return repo.save(employee);
    }
}
