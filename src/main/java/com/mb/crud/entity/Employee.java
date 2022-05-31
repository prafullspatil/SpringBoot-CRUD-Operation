package com.mb.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String employeeName;

	private String employeeEmail;

	private Double salary;

	public Employee(Integer id, String employeeName, String employeeEmail, Double salary)
	{
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.salary = salary;
	}

	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail()
	{
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail)
	{
		this.employeeEmail = employeeEmail;
	}

	public Double getSalary()
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

}
