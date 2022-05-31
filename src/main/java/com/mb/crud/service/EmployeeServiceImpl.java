package com.mb.crud.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.crud.entity.Employee;
import com.mb.crud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList()
	{
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id)
	{
		Employee empDB = employeeRepository.findById(id).get();

		if (Objects.nonNull(employee.getEmployeeName())
				&& !"".equalsIgnoreCase(
						employee.getEmployeeName()))
		{
			empDB.setEmployeeName(
					employee.getEmployeeName());
		}

		if (Objects.nonNull(
				employee.getEmployeeEmail())
				&& !"".equalsIgnoreCase(
						employee.getEmployeeEmail()))
		{
			empDB.setEmployeeEmail(
					employee.getEmployeeEmail());
		}

		if (Objects.nonNull(employee.getSalary())
				&& !"".equals(employee.getSalary()))
		{
			empDB.setSalary(
					employee.getSalary());
		}

		return employeeRepository.save(empDB);
	}

	@Override
	public void deleteEmployeeById(Integer id)
	{
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);

	}

}
