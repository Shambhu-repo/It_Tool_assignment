package com.assignment_8;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Child extends Parent{
	String name;
	int roll;
	

	public Child(String name, String name2, int roll) {
		super(name);
		name = name2;
		this.roll = roll;
	}


	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		
	}
	
}
class Parent{
	String name;

	public Parent(String name) {
		super();
		this.name = name;
		
	}
	
	
}
