package com.kasmoprav.EmployeeManagement.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeDetails {
    @Id
    private String empId;
    private String empFirstName;
    private String empLastName;
    private String empAddress;
    private String salary;
}
