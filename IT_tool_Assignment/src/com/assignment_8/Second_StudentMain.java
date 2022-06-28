package com.assignment_8;

 public class Second_StudentMain {
	 public static void main(String[]args) {
		 Student s = new Student();
		 Student s1=new Student("Alex");
		 Student s2=new Student("Alisa");
 }

}
 class Student{
	 String name="unknown";
	public Student() {
		System.out.println(name);
		
	}
	public Student(String name) {
      this.name = name;
		System.out.println("name: "+name);
	}
	
 }


