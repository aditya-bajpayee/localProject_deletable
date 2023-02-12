package com.employeeProject.service;

import java.util.List;

import com.employeeProject.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	 Employee getEmployeeById(int id);
	
	 void saveEmployee(Employee employee);
	
	 void deleteEmployeById(int id);
	 
}
