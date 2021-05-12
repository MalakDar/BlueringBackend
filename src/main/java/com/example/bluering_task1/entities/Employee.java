package com.example.bluering_task1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="employee")
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String firstName;
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name="department_id",referencedColumnName="id",nullable=false)
	@JsonIgnore
	private Department department;
	
	
	
	public Employee() {}
	public Employee(String firstName, String lastName, Department dep) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department=dep;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
