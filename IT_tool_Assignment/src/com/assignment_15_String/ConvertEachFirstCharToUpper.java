package com.assignment_15_String;

import java.util.Scanner;

public class ConvertEachFirstCharToUpper {
	
		
	public static void uperCase(String[] arr) {
      	StringBuffer sb= new StringBuffer(); // StringBuffer convert immutable string into mutable.
        
      	for(int i =0;i<arr.length;i++) {
        	 sb.append(Character.toUpperCase(arr[i].charAt(0)))  // 
        		.append(arr[i].substring(1)).append(" ");

		
	}
         System.out.println("Result : " + sb);
	}
	
	
	
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write  a sentence");
         String	str=	scan.nextLine();
      	String [] s= str.trim().split("\\s+");  //this represents white space of string between words .
      	//and + sign helps to maintain one white space between words
      	
      	uperCase(s);
		
		

	}

}




