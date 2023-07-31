package com.simform.assignment.controller;

import com.simform.assignment.entity.Employees;
import com.simform.assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping
    public Employees create(@RequestBody Employees employees) {
        return employeeService.create(employees);
    }
}
