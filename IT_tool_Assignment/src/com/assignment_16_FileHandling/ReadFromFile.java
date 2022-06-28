package com.assignment_16_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	

	
	
	public static String readTextFile(String filePath) {
	BufferedReader reader;
	String  line="";

	try {
		
		reader = new BufferedReader(new FileReader(filePath));
		
		 line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			// read next line
			line = reader.readLine();
		}
		
		
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return line;

	}
	
	
}	
	
	
	

	
	
	


