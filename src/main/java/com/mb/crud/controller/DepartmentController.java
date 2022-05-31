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
import com.mb.crud.entity.Department;
import com.mb.crud.service.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController
{

	// Annotation
	@Autowired
	private DepartmentService departmentService;

	// Save operation
	@PostMapping
	public Department saveDepartment(
			@RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/{id}")
	public Department updateDepartment(@RequestBody Department department,
			@PathVariable("id") Integer departmentId)
	{
		return departmentService.updateDepartment(
				department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/{id}")
	public String deleteDepartmentById(@PathVariable("id") Integer departmentId)
	{
		departmentService.deleteDepartmentById(
				departmentId);
		return "Deleted Successfully";
	}

	// @GetMapping("/getDepartmentName")
	// public List<Department> getDepartmentName()
	// {
	// return departmentService.getDepartmentName();
	// }

	// @GetMapping("/{id}")
	// public Department getDepartmentById(@RequestBody Department department,
	// @PathVariable("id") Long departmentId)
	// {
	// return departmentService.getDepartmentById(
	// department, departmentId);
	// }

}
