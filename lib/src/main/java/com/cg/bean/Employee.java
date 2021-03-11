package com.cg.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String empName;
	
	@Autowired
	private Department department;
	private List<Address> address;
	
	
	
	public Employee(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	public Employee(int id, String empName, Department department, List<Address> address) {
		super();
		this.id = id;
		this.empName = empName;
		this.department = department;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", department=" + department + ", address=" + address
				+ "]";
	}

	
	
	

}
