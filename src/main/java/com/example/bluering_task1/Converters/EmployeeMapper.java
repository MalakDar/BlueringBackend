package com.example.bluering_task1.Converters;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.bluering_task1.entities.Employee;
import com.example.bluering_task1.Converters.EmployeeDTO;


@Mapper(componentModel="spring")
public interface EmployeeMapper {

	EmployeeMapper INSTANCE=Mappers.getMapper(EmployeeMapper.class);
	
	Employee employeeDTOToEmployee(EmployeeDTO emDTO);
	EmployeeDTO employeeToEmployeeDTO(Employee em);
}
