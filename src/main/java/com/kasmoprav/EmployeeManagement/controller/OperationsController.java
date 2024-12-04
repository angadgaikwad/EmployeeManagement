package com.kasmoprav.EmployeeManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doOperation")
public class OperationsController {

@PostMapping("/addEmployee")
    String addEmployee(){
    return "";
}

}
