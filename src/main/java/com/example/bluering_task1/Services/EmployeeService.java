package com.example.bluering_task1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bluering_task1.entities.Department;
import com.example.bluering_task1.entities.Employee;
import com.example.bluering_task1.repositories.EmployeeRepository;



@Service
public class EmployeeService {
	
@Autowired	
private EmployeeRepository emRepo;

public List<Employee> getEmployees(){
	return emRepo.findAll();
}
public List<Employee> getEmployeesByDepartment(Department department) {
	return emRepo.findByDepartment(department);
}
}
