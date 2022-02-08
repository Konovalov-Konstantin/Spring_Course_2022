package com.example.springboot_jparepository.service;


import com.example.springboot_jparepository.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee (int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);

}
