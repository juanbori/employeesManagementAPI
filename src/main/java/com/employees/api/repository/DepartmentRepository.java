package com.employees.api.repository;

import com.employees.api.entity.Department;
import com.employees.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
