package com.kasmoprav.EmployeeManagement.repository;

import com.kasmoprav.EmployeeManagement.model.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Long> {
}
