package com.github.dayannas.spring_rest.controller;

import com.github.dayannas.spring_rest.entity.Employee;
import com.github.dayannas.spring_rest.exception.EmployeeIncorrectData;
import com.github.dayannas.spring_rest.exception.NoSuchEmployeeException;
import com.github.dayannas.spring_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private final EmployeeService employeeService;

    public RestController(@Autowired EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("Employee with ID = " + id + " not found in Database!");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        if (employeeService.getEmployee(id) == null) {
            throw new NoSuchEmployeeException("Employee with ID = " + id + " not found in Database");
        }
        employeeService.deleteEmployee(id);
        return "Employee with id " + id + " was deleted";
    }
}
