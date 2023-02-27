package com.example.employeeMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Employee")
public class Employee {

    @Id
    private Integer id;
    private String empName;
    private String empAddress;
    private String empMNumber;

}
