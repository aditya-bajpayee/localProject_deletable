package com.employeeProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeProject.model.Employee;
import com.employeeProject.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeById(int id) {
		employeeRepository.deleteById(id);
	}
}
