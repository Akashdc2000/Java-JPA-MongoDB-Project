package com.spring.springjpamongodb.repository;

import com.spring.springjpamongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends MongoRepository<Employee,Integer> {

    public List<Employee> findByName(String name);
    public List<Employee> findByDept(String dept);

    public List<Employee> findByDeptAndSalary(String dept,int salary);

    public List<Employee> findByDeptAndSalaryGreaterThan(String dept,int salary);



}
