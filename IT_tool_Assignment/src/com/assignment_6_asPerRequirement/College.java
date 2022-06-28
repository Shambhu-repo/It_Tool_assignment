package com.assignment_6_asPerRequirement;

public class College {
private	String college_name;
private String faculty_name;
private String address;

public College() {}
public College(String college_name, String faculty_name, String address) {
	super();
	this.college_name = college_name;
	this.faculty_name = faculty_name;
	this.address = address;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public String getFaculty_name() {
	return faculty_name;
}
public void setFaculty_name(String faculty_name) {
	this.faculty_name = faculty_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "College [college_name=" + college_name + ", faculty_name=" + faculty_name + ", address=" + address + "]";
}




}
