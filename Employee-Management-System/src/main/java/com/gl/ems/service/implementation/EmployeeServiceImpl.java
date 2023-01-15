package com.gl.ems.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ems.entity.Employee;
import com.gl.ems.repository.EmployeeRepository;
import com.gl.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void saveEmployee(Employee emp) {
		this.repository.save(emp);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			throw new RuntimeException("Employee not found for id: " + id);
		}
	}

	@Override
	public void deleteEmployeeById(long id) {
		repository.deleteById(id);
	}

}
