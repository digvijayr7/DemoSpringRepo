package com.Employee.EmployeeApplication.controller;

import com.Employee.EmployeeApplication.entity.Employee;
import com.Employee.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/employees",method = RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee){
       employeeService.CreateEmployee(employee);

    }
    @RequestMapping(value = "/employees/{id}",method =RequestMethod.PUT )
    public void updateEmployee(@PathVariable int id ,@RequestBody Employee employee){
       employeeService.updateEmployee(employee);

    }
    @RequestMapping(value = "/employees/{id}",method =RequestMethod.DELETE )

    public List<Employee> deleteEmployee(@PathVariable int id){
       employeeService.deleteEmployee(id);
       return employeeService.getEmployeeList();

    }
}
