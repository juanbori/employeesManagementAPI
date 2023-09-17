package com.employees.api.mapper;

import com.employees.api.dto.DepartmentDto;
import com.employees.api.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getName(),
                department.getDescription()
        );
    }

    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getId(),
                departmentDto.getName(),
                departmentDto.getName()
        );
    }
}