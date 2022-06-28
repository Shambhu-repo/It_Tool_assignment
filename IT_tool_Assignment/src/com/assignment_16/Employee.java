package com.assignment_16;

import java.util.Date;

public class Employee {
	
	private String name;
	private String address;
	private String position;
	private Date dateOfBirth;
	private Date dateOfjoining;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfjoining() {
		return dateOfjoining;
	}
	public void setDateOfjoining(Date dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", position=" + position + ", dateOfBirth="
				+ dateOfBirth + ", dateOfjoining=" + dateOfjoining + "]";
	}
	
		
		}
	
	


