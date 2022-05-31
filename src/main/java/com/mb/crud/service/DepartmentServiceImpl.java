package com.mb.crud.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.crud.entity.Department;
import com.mb.crud.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService
{

	@Autowired
	private DepartmentRepository departmentRepository;

	// Save operation
	@Override
	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);
	}

	// Read operation
	@Override
	public List<Department> fetchDepartmentList()
	{
		return (List<Department>) departmentRepository.findAll();
	}

	// Update operation
	@Override
	public Department updateDepartment(Department department,
			Integer departmentId)
	{
		Department depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName())
				&& !"".equalsIgnoreCase(
						department.getDepartmentName()))
		{
			depDB.setDepartmentName(
					department.getDepartmentName());
		}

		if (Objects.nonNull(
				department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(
						department.getDepartmentAddress()))
		{
			depDB.setDepartmentAddress(
					department.getDepartmentAddress());
		}

		if (Objects.nonNull(department.getDepartmentCode())
				&& !"".equalsIgnoreCase(
						department.getDepartmentCode()))
		{
			depDB.setDepartmentCode(
					department.getDepartmentCode());
		}

		return departmentRepository.save(depDB);
	}

	@Override
	public void deleteDepartmentById(Integer departmentId)
	{
		departmentRepository.deleteById(departmentId);

	}

	// Delete operation
	// @Override
	// public void deleteDepartmentById(Integer departmentId);
	// {
	// departmentRepository.deleteById(departmentId);
	// }
	//
	// @Override
	// public List<Department> getDepartmentName()
	// {
	// return departmentRepository.getDepartmentName();
	// }

	// @Override
	// public Department getDepartmentById(Department department, Long departmentId)
	// {
	// Department depDB = departmentRepository.findById(departmentId).get();
	// return depDB;
	// }
}