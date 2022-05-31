package com.mb.crud.controller;

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
import com.mb.crud.entity.Employee;
import com.mb.crud.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController
{

	// Annotation
	@Autowired
	private EmployeeService employeeService;

	// Save operation
	@PostMapping
	public Employee saveEmployee(
			@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}

	// Read operation
	@GetMapping
	public List<Employee> fetchEmployeeList()
	{
		return employeeService.fetchEmployeeList();
	}

	// Update operation
	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,
			@PathVariable("id") Integer id)
	{
		return employeeService.updateEmployee(
				employee, id);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable("id") Integer id)
	{
		employeeService.deleteEmployeeById(
				id);
		return "Deleted Successfully";
	}
}
