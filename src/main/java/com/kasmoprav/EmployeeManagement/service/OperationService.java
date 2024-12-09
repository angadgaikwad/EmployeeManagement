package com.kasmoprav.EmployeeManagement.service;

import com.kasmoprav.EmployeeManagement.model.entity.EmployeeDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OperationService {
    EmployeeDetails addEmployee(EmployeeDetails employeeDetails);

    void deleteEmployee(Long id);

    List<EmployeeDetails> getEmployees();
}
