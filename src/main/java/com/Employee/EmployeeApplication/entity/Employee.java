package com.Employee.EmployeeApplication.entity;

public class Employee {
    int employeeId;
    String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployee(int employee) {
        this.employeeId = employee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public Employee(int employee, String employeeName, String employeeCity) {
        this.employeeId = employee;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }

    String employeeCity;
}
