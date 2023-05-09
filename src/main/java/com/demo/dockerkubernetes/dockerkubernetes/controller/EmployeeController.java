package com.demo.dockerkubernetes.dockerkubernetes.controller;

import com.demo.dockerkubernetes.dockerkubernetes.data.EmployeeData;
import com.demo.dockerkubernetes.dockerkubernetes.dto.Employee;
import com.demo.dockerkubernetes.dockerkubernetes.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee/create")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.insertData(employee);
    }

    @GetMapping("/employee/get/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getData(id);
    }

}
