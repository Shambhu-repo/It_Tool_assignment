package com.assignment_16;

import java.io.BufferedReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

	//ChangeToUpperCase ctuc=new ChangeToUpperCase();
		
	EmployeeService es = new EmployeeService();
	//Employee emp = es.addValueInEmployee();
	//Employee emp = es.copingText();;

   // System.out.println(emp);

	 EmployeeService.printEmployee();
	
	}

}
