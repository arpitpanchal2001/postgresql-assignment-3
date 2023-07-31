package com.simform.assignment.repository;

import com.simform.assignment.entity.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeViewRepository extends JpaRepository<EmployeeView,Long> {
}
