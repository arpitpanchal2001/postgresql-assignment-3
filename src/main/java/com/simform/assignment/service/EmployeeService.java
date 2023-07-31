package com.simform.assignment.service;

import com.simform.assignment.entity.Employees;
import com.simform.assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employees create(Employees employees) {
       return employeeRepository.save(employees);
    }
}
