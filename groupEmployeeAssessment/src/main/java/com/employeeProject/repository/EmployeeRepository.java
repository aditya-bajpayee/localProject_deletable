package com.employeeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
