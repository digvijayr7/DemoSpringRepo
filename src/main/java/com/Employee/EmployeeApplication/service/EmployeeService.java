package com.Employee.EmployeeApplication.service;

import com.Employee.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List <Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1,"digvijay","dhule"),
            new Employee(2,"second","jalgaon"),
            new Employee(3,"third","junwane")

    ));


    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public Employee getEmployee(int id){
        return employeeList.stream().filter(e-> (e.getEmployeeId()==id)).findFirst().get();
    }
    public void CreateEmployee(Employee employee){
        employeeList.add(employee);
    }
}
