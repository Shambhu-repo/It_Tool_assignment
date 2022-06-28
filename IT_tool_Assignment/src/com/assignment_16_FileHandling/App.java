package com.assignment_16_FileHandling;

import java.text.ParseException;
import java.util.List;

public class App {

	public static void main(String[] args)  {
		
		String filePath="src/com/assignment_16_FileHandling/emp.txt";

		
		
		List<Employee> empol =ReaderClass.getTextFromFile(filePath);
     System.out.println(empol);		

	}
 
}
