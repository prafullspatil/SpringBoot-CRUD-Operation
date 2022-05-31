package com.mb.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
