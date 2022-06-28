package com.assignment_16_FileHandling;

import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparator<Employee> {
	private  int id;
	private String name;
	private int deptId;
	private Date dateOfJoining;
	private Double salary;
	private String designation;


	public Employee(int id, String name, int deptId, Date dateOfJoining, Double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", dateOfJoining=" + dateOfJoining
				+ ", salary=" + salary + ", designation=" + designation + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}




