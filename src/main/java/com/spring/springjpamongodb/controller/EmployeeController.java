package com.spring.springjpamongodb.controller;


import com.spring.springjpamongodb.entity.Employee;
import com.spring.springjpamongodb.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id){
        return employeeService.updateEmployee(employee,id);
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id) {
        return employeeService.getEmployeeByID(id);
    }


    @GetMapping("/getbyname/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name")String name){
        return employeeService.getEmployeeByName(name);
    }

    @GetMapping("/getbydept/{dept}")
    public List<Employee> getEmployeeByDept(@PathVariable("dept")String dept){
        return employeeService.getEmployeeByDept(dept);
    }

    @GetMapping("/get/{dept}/{salary}")
    public List<Employee> getEmployeeByDeptAndSalary(@PathVariable("dept")String dept,@PathVariable("salary")int salary){
        return employeeService.getByDeptAndSalary(dept,salary);
    }

    @GetMapping("/condition/{dept}/{salary}")
    public List<Employee> getEmployeeByDeptAndSalaryGreaterThan(@PathVariable("dept")String dept,@PathVariable("salary")int salary){
        return employeeService.getByDeptAndSalaryGreaterThan(dept,salary);
    }
}

