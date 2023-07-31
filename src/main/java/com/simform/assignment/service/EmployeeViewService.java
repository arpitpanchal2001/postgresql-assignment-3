package com.simform.assignment.service;

import com.simform.assignment.entity.EmployeeView;
import com.simform.assignment.repository.EmployeeViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeViewService {
    @Autowired
    EmployeeViewRepository employeeViewRepository;

    public List<EmployeeView> getAllEmployees() {
        return employeeViewRepository.findAll();
    }
    public EmployeeView  create(EmployeeView employeeView ) {
        return employeeViewRepository.save(employeeView);
    }
}
