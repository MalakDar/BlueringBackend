package com.example.bluering_task1.Converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.bluering_task1.entities.Employee;

@Component
public class EmployeeConverter {
 public Employee dtoToEmployee(EmployeeDTO emDTO) {
//	 Employee em= new Employee();
//	 em.setFirstName(emDTO.getFirstName());
//	 em.setLastName(emDTO.getLastName());
//	 em.setDepartment(null);
//	 return em;
	 ModelMapper mapper=new ModelMapper();
	 Employee map=mapper.map(emDTO, Employee.class);
	 return map;
 }
}
