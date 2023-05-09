package com.demo.dockerkubernetes.dockerkubernetes.service;

import com.demo.dockerkubernetes.dockerkubernetes.data.EmployeeData;
import com.demo.dockerkubernetes.dockerkubernetes.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeData employeeData;

    public Employee insertData(Employee request){
        employeeData.save(request);
        return request;
    }

    public Employee getData(Integer id){
        return employeeData.findById(id).get();
    }

}
