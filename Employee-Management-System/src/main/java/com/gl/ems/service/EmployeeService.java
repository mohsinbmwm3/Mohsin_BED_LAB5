package com.gl.ems.service;

import java.util.List;

import com.gl.ems.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee emp);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
