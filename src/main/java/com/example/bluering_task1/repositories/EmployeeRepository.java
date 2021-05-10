package com.example.bluering_task1.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bluering_task1.entities.Department;
import com.example.bluering_task1.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	List<Employee> findByDepartment(Department department);
}
