package com.kasmoprav.EmployeeManagement.service;


import com.kasmoprav.EmployeeManagement.model.entity.EmployeeDetails;
import com.kasmoprav.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OperationServiceImpl implements OperationService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public EmployeeDetails addEmployee(EmployeeDetails employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }

    @Override
    public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDetails> getEmployees() {
        return employeeRepository.findAll();
    }
}
