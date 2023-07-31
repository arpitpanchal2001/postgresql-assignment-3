package com.simform.assignment.controller;

import com.simform.assignment.entity.EmployeeView;
import com.simform.assignment.service.EmployeeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeesView")
public class EmployeeViewController {

    @Autowired
    EmployeeViewService employeeViewService;
    @GetMapping
    public List<EmployeeView> getAllEmployees() {
        return employeeViewService.getAllEmployees();
    }
    @PostMapping
    public EmployeeView create(@RequestBody EmployeeView employeeView ) {
       return employeeViewService.create(employeeView);
    }
}
