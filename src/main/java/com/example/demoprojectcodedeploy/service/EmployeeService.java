package com.example.demoprojectcodedeploy.service;

import com.example.demoprojectcodedeploy.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
