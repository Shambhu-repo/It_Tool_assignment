package com.assignment_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	protected static Employee [] e = new Employee[5];

	
	public static  Employee[] newEmployee() throws IOException {
		String fileName = "src/com/assignment_16/file.txt";
		//String s = e.toString();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
		    for (int i = 0; i <e.length; i++) {
		    	String s = reader.readLine();
		    	
		    	
		    	
		    	
		        e[i]= new Employee(s);
		    }
		    
		  
		} catch (IOException | NumberFormatException e1) {
		    System.err.println("error reading employee from file "+fileName);
		    e1.printStackTrace();
		}
		
		return e;
		

	}
	
	
public static Employee[] printEmployee() throws IOException {
			Employee [] e = newEmployee();
		//String s1="";
			for(int i=0;i<e.length;i++) {
			    System.out.println(e[i]);
			
		}
			
			return e;	
	
			
	}

public static void uppercase() throws IOException {
	

	}

}