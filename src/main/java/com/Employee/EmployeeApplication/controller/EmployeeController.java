package com.Employee.EmployeeApplication.controller;

import com.Employee.EmployeeApplication.entity.Employee;
import com.Employee.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@Controller
@RestController
public class EmployeeController {

      @Autowired
     EmployeeService employeeService;
   @RequestMapping("/employees")
   public List <Employee> findAllEmployees() {

        return employeeService.getEmployeeList();

    }
    @RequestMapping("/employees/{id}")
    public Employee FindAnEmployee(@PathVariable int id){
       return employeeService.getEmployee(id);

    }
}
