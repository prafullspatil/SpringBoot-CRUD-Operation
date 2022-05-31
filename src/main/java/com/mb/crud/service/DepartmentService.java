package com.mb.crud.service;

import java.util.List;
import com.mb.crud.entity.Department;

public interface DepartmentService
{

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
			Integer departmentId);

	// Delete operation
	void deleteDepartmentById(Integer departmentId);

	// Department getDepartmentById(Department department, Long departmentId);

	// List<Department> getDepartmentName();
}
