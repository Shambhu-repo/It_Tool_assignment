package com.assignment_6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Service {
	public static Scanner scan = new Scanner(System.in);
	public static List<Student> student = new ArrayList<Student>();
	public static List<College> college = new ArrayList<College>();

	public static List<Student> newStudent() {
		//List<Student> student = new ArrayList<Student>();
		Student s = new Student();
		int s_rollNo=0;

		System.out.println("Student's Name : ");
		String s_name = scan.next();

		System.out.println("Student's College_Name: ");
		String College_name = scan.next();

		System.out.println("Student's Faculty : ");
		String s_faculty = scan.next();

		System.out.println("Student's Class : ");
		String student_class = scan.next();

		try {
			System.out.println("Student's RollNo : ");
			s_rollNo = scan.nextInt();

		}
		catch(InputMismatchException e) {
			System.out.println("********Please Numbers only********");
		}

		s.setStudent_name(s_name);
		s.setCollege_name(College_name);
		s.setStudent_faculty(s_faculty);
		s.setStudent_class(student_class);
		s.setStudent_rollNo(s_rollNo);

		student.add(s);

		return student;
	}

	public static void printStudent() {
		for(Student s:student) {
			System.out.println("Student Name : -> "  +s.getStudent_name() +  "  College_name : ->  "  +  s.getCollege_name() +
					"  Student_Faculty :  ->  "  + s.getStudent_class()  +  " Student_rollNo: ->  " + s.getStudent_rollNo());

		}

	}

	public static List<College> collegeInfo() {
		College c = new College();

		System.out.println("College Name : ");
		String college_name = scan.next();

		System.out.println("Student's College_faculty: ");
		String College_faculty = scan.next();

		System.out.println("Faculty Head : ");
		String s_faculty_head = scan.next();

		System.out.println("College Address : ");
		String college_Address = scan.next();

		c.setCollege_name(college_name);
		c.setCollege_faculty(College_faculty);
		c.setFaculty_head(s_faculty_head);
		c.setCollege_address(college_Address);

		college.add(c);
		return college;
	}
	public static void printCollege() {
		for(College c:college) {
			System.out.println(" College Name : -> " +  c.getCollege_name()  +  "  College_faculty : ->  "  +  c.getCollege_faculty()+
					" Faculty_Head :  -> "  +  c.getFaculty_head()  + "   College Address : ->  " +   c.getCollege_address());

		}

	}

}
