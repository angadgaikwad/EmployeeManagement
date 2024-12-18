package com.kasmoprav.EmployeeManagement.controller;

import com.kasmoprav.EmployeeManagement.model.entity.EmployeeDetails;
import com.kasmoprav.EmployeeManagement.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OperationsController {

    @GetMapping("/")
    public String home(@RequestParam(value="name",defaultValue = "")String name, Model model){
        String sayHello= "Hello "+name;
        return "home";
    }
//    @Autowired
//    OperationService operationService;
//
//    @PostMapping("/addEmployee")
//    public  String addEmployee(@RequestBody EmployeeDetails employeeDetails){
//        operationService.addEmployee(employeeDetails);
//        return "Employee added successfully.";
//    }
//
//    @PostMapping("/delete")
//    public String deleteEmployee(@RequestBody Long id){
//        operationService.deleteEmployee(id);
//        return "Employee deleted successfully.";
//    }
//
//    @GetMapping("/getEmployees")
//    public List<EmployeeDetails> getEmployeeDetails(){
//        return operationService.getEmployees();
//    }
//


}