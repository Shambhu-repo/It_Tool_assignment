package com.assignment_6_asPerRequirement;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Student s= studetnInfo(1,"Shambhu");
		College c = collegeInfo("Thakuraram","commerce","Birgunj");
		
		System.out.println("Roll No. :" + s.getId()+ "   Name :   " + s.getName()+ " CollegeName:  "   + c.getCollege_name()  + " Faculty Name:   " + c.getFaculty_name() +
				" Address :  "  + c.getAddress());
			

	}
		
		
public static Student studetnInfo(int id ,String name ) {
	Student s = new Student();
	s.setId(id);
	s.setName(name);
	 return s;
	
}
public static College collegeInfo(String c_name, String c_faculty, String c_address) {
	College c = new College();
	c.setCollege_name(c_name);
	c.setFaculty_name(c_faculty);
	c.setAddress(c_address);
	
	
	
	return c;
	
}


	




	}


