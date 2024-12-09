package com.kasmoprav.EmployeeManagement.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="EmployeeDetails")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empId;
    private String empFirstName;
    private String empLastName;
    private String empAddress;
    private String salary;
}
