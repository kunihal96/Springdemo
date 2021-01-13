package com.workspaces.crud.example.controller;

import com.workspaces.crud.example.entity.Employee;
import com.workspaces.crud.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/save")
    public Employee dataSave(@RequestBody Employee employee)
    {
        return  employeeService.saveProduct(employee);

    }

    @GetMapping("/retrieve/{id}")
    public Employee dataRetrieve(@PathVariable int id)
    {
        return employeeService.getEmployeeByID(id);

    }

    @DeleteMapping("/delete/{id}")
    public String dataDelete(@PathVariable int id)
    {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update")
    public Employee dataUpdate(@RequestBody Employee employee)
    {
        return employeeService.updateEmployee(employee);
    }
}
