package com.mb.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.crud.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

	// @Query("SELECT new com.mb.crud.entity.Department(d.departmentName) FROM Department")
	// public List<Department> getDepartmentName();

}
