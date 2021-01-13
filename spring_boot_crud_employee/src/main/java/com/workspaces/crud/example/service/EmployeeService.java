package com.workspaces.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.workspaces.crud.example.entity.Employee;
import com.workspaces.crud.example.repository.EmployeeRepo;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repositiry;
	
	public Employee saveProduct(Employee employee)
	{
		return 	repositiry.save(employee);
	}
	
	public List<Employee> saveProducts(List<Employee> employee)
	{
		return repositiry.saveAll(employee);
	}
	
	public Employee getEmployeeByID(int id)
	{
		return repositiry.findById(id).orElse(null);
	}

	public  String deleteEmployee(int id)
	{
		repositiry.deleteById(id);
		return "employee data deleted";
	}

	public  Employee updateEmployee(Employee employee)
	{
		Employee existingEmployee=repositiry.findById(employee.getId()).orElse(null);
		existingEmployee.setDepartment(employee.getDepartment());
		existingEmployee.setId(employee.getId());
		existingEmployee.setName(employee.getName());
		return  repositiry.save(existingEmployee);
	}
}
