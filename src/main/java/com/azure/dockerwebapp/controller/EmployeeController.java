package com.azure.dockerwebapp.controller;
import com.azure.dockerwebapp.model.Employee;
import com.azure.dockerwebapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("hello")
    public String helloMessage(){
        return "Hello Randhir. This is the response from azure web app.";
    }

    @GetMapping("employee/{id}")
    public Employee saveEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("employee")
    public void saveEmployee(@RequestBody Employee employee){
       // employeeService.saveEmployee(employee);
    }
}
