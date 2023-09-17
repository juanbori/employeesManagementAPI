package com.employees.api.controller;

import com.employees.api.dto.EmployeeDto;
import com.employees.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> add(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.create(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> get(@PathVariable Long employeeId) {
        EmployeeDto employeeDto = employeeService.getById(employeeId);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<EmployeeDto>> getAll() {
        List<EmployeeDto> employees = employeeService.getAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> update(@PathVariable("id") Long employeeId,
                                              @RequestBody EmployeeDto employeeBody) {
        EmployeeDto employeeDto = employeeService.update(employeeId, employeeBody);
        return ResponseEntity.ok(employeeDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long employeeId) {
        employeeService.delete(employeeId);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}
