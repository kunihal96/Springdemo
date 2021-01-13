package com.workspaces.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workspaces.crud.example.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

}
