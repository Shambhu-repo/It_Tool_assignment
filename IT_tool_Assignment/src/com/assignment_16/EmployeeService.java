package com.assignment_16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.assignment_17.Employee;

public class EmployeeService {
	protected static Employee [] emp=new Employee[5];

	
	//originla
//	public Employee addValueInEmployee() throws IOException { // setting value to employee object
//		
//		Employee emp=new Employee();
//		ChangeToUpperCase ctuc = new ChangeToUpperCase();
//        StringBuffer sb =ctuc.changeUpperCase1();
//	     String upperCase =	sb.toString();
//	    
//	     Scanner scan = new Scanner(upperCase);
//	     while(scan.hasNext()) {
//	        emp.setName(scan.next());
//	        emp.setAddress(scan.next());
//	    	emp.setPosition(scan.next());
//	    	emp.setDateOfBirth(scan.next());
//	    	emp.setDateOfjoining(scan.next());
//	    	
//	     }
//	     scan.close();
//	     
//	     
//	    
//	     return  emp;
//}
	
	
public  static Employee[] addValueInEmployee() throws IOException { // setting value to employee object
		
		//Employee [] emp=new Employee[5];
		ChangeToUpperCase ctuc = new ChangeToUpperCase();
        StringBuffer sb =ctuc.changeUpperCase1();
	     String upperCase =	sb.toString();
	    
	     Scanner scan = new Scanner(upperCase);
	     for(int i =0;i<emp.length;i++) {
	    	 String s=scan.nextLine();
	    	 emp[i]=new Employee(s);
	     }
	     
//	     while(scan.hasNext()) {
//	        emp.setName(scan.next());
//	        emp.setAddress(scan.next());
//	    	emp.setPosition(scan.next());
//	    	emp.setDateOfBirth(scan.next());
//	    	emp.setDateOfjoining(scan.next());
//	    	
//	     }

	     scan.close();
	     
	     
	    
	     return  emp;
}


public static void printEmployee() throws IOException  {
	
	 emp = addValueInEmployee();
//String s1="";
	for(int i=0;i<emp.length;i++) {
	    System.out.println(emp[i]);
	    
	
}
	

	
}

	
//	public Employee copingText() {  // need to see ...this is giving null because emp is not holding any dataS
//		Employee emp=new Employee();
//		 try {
//	            FileWriter writer = new FileWriter("src/com/assignment_16/output.txt", true);
//	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//	 
//	            bufferedWriter.write(emp.getName()+" "+emp.getAddress()+" "+ emp.getPosition()+" "+emp.getDateOfBirth()+ " "+ emp.getDateOfjoining());
//	            bufferedWriter.newLine();
//	            bufferedWriter.write("See You Again!");
//	 
//	            bufferedWriter.close();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	 
//		 return emp;
//	    }
//		
	}
	
	
		
		

