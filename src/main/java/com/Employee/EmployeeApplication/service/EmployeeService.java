package com.Employee.EmployeeApplication.service;

import com.Employee.EmployeeApplication.entity.Employee;
import com.Employee.EmployeeApplication.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
  @Autowired
  employeeRepository employeeRepository;
    public List<Employee> getEmployeeList() {
        //return employeeList;
        return employeeRepository.findAll();
    }
    public Employee getEmployee(int id){
       // return employeeList.stream().filter(e-> (e.getEmployeeId()==id)).findFirst().get();
          return  employeeRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
    }
    public void CreateEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void updateEmployee(Employee employee){
       /* List<Employee> tempEmployee = new ArrayList<>();

            for (Employee emp : employeeList)
            { if (emp.getEmployeeId()==employee.getEmployeeId())
            {
                emp.setEmployeeName(employee.getEmployeeName());
                emp.setEmployeeCity(employee.getEmployeeCity());
            }
            tempEmployee.add(emp);
            }
            this.employeeList=tempEmployee;

        */
        employeeRepository.save(employee);
    }
    public void deleteEmployee(int id){
        /*List<Employee> tempEmployee = new ArrayList<>();
        for(Employee emp : employeeList){
            if (emp.getEmployeeId()==id)
                continue;
            tempEmployee.add(emp);

        }
        this.employeeList=tempEmployee;

         */
        employeeRepository.delete(employeeRepository.getById(id));


    }
}
