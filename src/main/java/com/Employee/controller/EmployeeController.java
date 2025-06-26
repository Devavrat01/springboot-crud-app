package com.Employee.controller;

import com.Employee.modal.Employee;
import com.Employee.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/employees")
// for swagger
@Tag(name = "Employee Management", description = "Operations related to Employee management")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }
    @PostMapping("/create")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping("/employee/update/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        return employeeService.update(id, updatedEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
        return "Employee deleted successfully";
    }
}

