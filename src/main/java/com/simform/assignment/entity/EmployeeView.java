package com.simform.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_view_tem")
public class EmployeeView {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;


    @Column(name = "salary")
    private Double salary;
}
