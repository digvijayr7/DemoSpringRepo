package com.Employee.EmployeeApplication.repository;

import com.Employee.EmployeeApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee,Integer>{

}
