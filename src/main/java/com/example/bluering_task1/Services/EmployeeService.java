package com.example.bluering_task1.Services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bluering_task1.Converters.EmployeeConverter;
import com.example.bluering_task1.Converters.EmployeeDTO;
import com.example.bluering_task1.Converters.EmployeeMapper;
import com.example.bluering_task1.entities.Department;
import com.example.bluering_task1.entities.Employee;
import com.example.bluering_task1.repositories.EmployeeRepository;



@Service
public class EmployeeService {
	
	
	@Autowired	
	private EmployeeRepository emRepo;
	@Autowired	
	private DepartmentService depServ;
	@Autowired
	private EmployeeMapper emMapp;
	
	
	public List<Employee> getEmployees(){
		return emRepo.findAll();
	}
	public List<Employee> getEmployeesByDepartment(Department department) {
		return emRepo.findByDepartment(department);
	}
	public void deleteEmployeeById(Long id) {
		emRepo.deleteById(id);
	} 
	public void addEmployee(EmployeeDTO emDTO) {
		Employee employee=emMapp.employeeDTOToEmployee(emDTO);
		emRepo.save(employee);
//		String firstName=(em.get("firstName").toString());
//		String lastName=(em.get("lastName").toString());
//		
//		Department dep=depServ.getDepartmentById(Long.parseLong( em.get("department").toString()));
//		Employee newEm= new Employee(firstName,lastName,dep);
//		
//		emRepo.saveAndFlush(newEm);
	}
}
