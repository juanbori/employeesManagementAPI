package com.employees.api.service;

import com.employees.api.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto create(EmployeeDto employeeDto);

    EmployeeDto getById(Long id);

    List<EmployeeDto> getAll();

    EmployeeDto update(Long employeeId, EmployeeDto updatedEmployee);

    void delete(Long employeeId);
}
