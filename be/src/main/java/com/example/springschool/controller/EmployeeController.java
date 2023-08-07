package com.example.springschool.controller;


import com.example.springschool.entity.Employee;
import com.example.springschool.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
public class EmployeeController extends BaseController{
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public ResponseEntity<?> index(@RequestParam(required = false, defaultValue = "") String name){
        return ResponseEntity.ok(employeeService.findByName(name));
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.create(employee));
    }
}
