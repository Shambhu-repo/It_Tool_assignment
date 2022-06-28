package com.assignment_6;

public class College {
	private String college_name;
	private String college_faculty;
    private String faculty_head;
	private String college_address;
	
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getCollege_faculty() {
		return college_faculty;
	}
	public void setCollege_faculty(String college_faculty) {
		this.college_faculty = college_faculty;
	}
	public String getFaculty_head() {
		return faculty_head;
	}
	public void setFaculty_head(String faculty_head) {
		this.faculty_head = faculty_head;
	}
	public String getCollege_address() {
		return college_address;
	}
	public void setCollege_address(String college_address) {
		this.college_address = college_address;
	}
	@Override
	public String toString() {
		return "College [college_name=" + college_name + ", college_faculty=" + college_faculty + ", faculty_head="
				+ faculty_head + ", college_address=" + college_address + "]";
	}
	
		
	}
