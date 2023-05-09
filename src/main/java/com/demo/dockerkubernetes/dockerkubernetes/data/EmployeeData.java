package com.demo.dockerkubernetes.dockerkubernetes.data;

import com.demo.dockerkubernetes.dockerkubernetes.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeData extends JpaRepository<Employee,Integer> {
}
