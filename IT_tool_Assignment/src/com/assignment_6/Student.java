package com.assignment_6;



public class Student {
	private String student_name;
	private  String college_name;
	private String student_faculty;
	private String student_class;
	private int student_rollNo;
	
	
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getStudent_faculty() {
		return student_faculty;
	}
	public void setStudent_faculty(String student_faculty) {
		this.student_faculty = student_faculty;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	public int getStudent_rollNo() {
			return student_rollNo;

		}
	
	public void setStudent_rollNo(int student_rollNo) {
		
		if(student_rollNo>0) {
			this.student_rollNo = student_rollNo;
}
		}
	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", college_name=" + college_name + ", student_faculty="
				+ student_faculty + ", student_class=" + student_class + ", student_rollNo=" + student_rollNo + "]";
	}
	
	
	
}
