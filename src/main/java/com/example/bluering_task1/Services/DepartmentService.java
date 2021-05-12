package com.example.bluering_task1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bluering_task1.entities.Department;
import com.example.bluering_task1.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	
	@Autowired
	private DepartmentRepository depRepo;
	
	public List<Department> getDepartments(){
		return depRepo.findAll();
	}
    public Department getDepartmentByName(String name) {
    	return depRepo.findByDepartmentName(name);
    }
    public Department getDepartmentById(Long id) {
    	Department depar= depRepo.findById(id).get();
    	return depar;
    }
}
