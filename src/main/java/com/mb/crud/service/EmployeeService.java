package com.mb.crud.service;

import java.util.List;
import com.mb.crud.entity.Employee;

public interface EmployeeService
{

	// Save operation
	Employee saveEmployee(Employee employee);

	// Read operation
	List<Employee> fetchEmployeeList();

	// Update operation
	Employee updateEmployee(Employee employee,
			Integer id);

	// Delete operation
	void deleteEmployeeById(Integer id);
}
