package com.azure.dockerwebapp.service;

import com.azure.dockerwebapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    //private EmployeeRepository employeeRepository;

    /*public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }*/

   /* public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }*/

    public Employee getEmployee(Integer id) {

        //return employeeRepository.findById(id);
        return new Employee("Ram",1,"D001",22,"Delhi");

    }
}
