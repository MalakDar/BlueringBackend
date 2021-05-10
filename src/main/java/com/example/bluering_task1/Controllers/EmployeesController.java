package com.example.bluering_task1.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bluering_task1.Services.DepartmentService;
import com.example.bluering_task1.Services.EmployeeService;
import com.example.bluering_task1.entities.Department;
import com.example.bluering_task1.entities.Employee;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employees/")
public class EmployeesController {
	@Autowired
	 private EmployeeService emServ;
	@Autowired
	 private DepartmentService depServ;
		
		  @GetMapping("all")
		    public List<Employee> getEmployees() {
		        return emServ.getEmployees();
		    }
		  
		  @GetMapping("dep")
		  public List<Employee> getEmployeesByDep(){
			  List<Department> allDepartments= depServ.getDepartments();
			  return emServ.getEmployeesByDepartment(allDepartments.get(0));
		  }
		  
		  @GetMapping("department/{name}")
		  public List<Employee> getEmployeesByDepartmentname(@PathVariable String name){
			  Department department= depServ.getDepartmentByName(name);
			  return emServ.getEmployeesByDepartment(department);
		  }
}
