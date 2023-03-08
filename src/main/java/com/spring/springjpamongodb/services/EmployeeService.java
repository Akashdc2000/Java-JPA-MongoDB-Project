package com.spring.springjpamongodb.services;

import com.spring.springjpamongodb.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();

    public String deleteEmployee(Integer id);

    public Employee updateEmployee(Employee employee,Integer id);
    public Employee getEmployeeByID(Integer id);

    public List<Employee> getEmployeeByName(String name);
    public List<Employee> getEmployeeByDept(String dept);

    public List<Employee> getByDeptAndSalary(String dept,int salary);

    public List<Employee> getByDeptAndSalaryGreaterThan(String dept,int salary);
}
