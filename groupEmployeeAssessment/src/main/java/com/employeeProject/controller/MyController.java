package com.employeeProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeProject.model.Employee;
import com.employeeProject.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class MyController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/employeelist")
	public List<Employee> employeeList(){
		return employeeServiceImpl.getAllEmployee();
	}
	
	@PostMapping("/create")
	public String createEmp(@RequestBody Employee employee) {
		employeeServiceImpl.saveEmployee(employee);
		return "Employee Created Successfully";
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmp(@PathVariable("id") int id,
			@RequestBody Employee employee) {
		
		Employee theEmployee;
		if(id != 0) {
			theEmployee = employeeServiceImpl.getEmployeeById(id);
			theEmployee.setFname(employee.getFname());
			theEmployee.setLname(employee.getLname());
			theEmployee.setGmail(employee.getGmail());
		}
		else
			theEmployee = new Employee(employee.getFname(),employee.getLname(),employee.getGmail());
		employeeServiceImpl.saveEmployee(theEmployee);
		return theEmployee;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeServiceImpl.deleteEmployeById(id);
		return "Deleted successfully";
	}
}
