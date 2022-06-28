package com.assignment_6_asPerRequirement;



public class Student {
	private int id;
	private String name;
	
	public Student() {}
	
		
	

	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
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
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +  "]";
	}
	

}
