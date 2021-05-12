package com.example.bluering_task1.Converters;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private Long departmentId;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getDepartment_id() {
		return departmentId;
	}

	public void setDepartment_id(Long department_id) {
		this.departmentId = department_id;
	}

	
}
