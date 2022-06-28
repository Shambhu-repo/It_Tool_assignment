package com.assignment_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChangeToUpperCase {

	public RecordInFile readFromFile() throws IOException { // reading from file
		
		RecordInFile  rf = new RecordInFile();
        File f = new File("src/com/assignment_16/file.txt");
		FileReader file = new FileReader(f);
		BufferedReader br = new BufferedReader(file);

		//StringBuffer sb = new StringBuffer();
		String  s;
      
		while((s=br.readLine())!=null) {
            rf.setEmployeeRecord(s);
			s=br.readLine();
		}
		br.close();
		return rf;
}
	
	

	
	public StringBuffer changeUpperCase1() throws IOException { // changing to uppercase
		RecordInFile rf;
		rf=readFromFile();
		StringBuffer sb= new StringBuffer(); // StringBuffer convert immutable string into mutable.
		String s = rf.toString();               // changing RecordInFle object to String
		String [] s1= s.trim().split("\\s+");  //this represents white space of string between words .
		for(int i =0;i<s1.length;i++) {
			sb.append(Character.toUpperCase(s1[i].charAt(0)))  // 
			.append(s1[i].substring(1)).append(" ");
		}
		return sb;

	}



	
		}
