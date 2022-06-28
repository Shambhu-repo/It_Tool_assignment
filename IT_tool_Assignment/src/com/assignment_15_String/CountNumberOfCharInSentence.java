package com.assignment_15_String;

import java.util.Scanner;

public class CountNumberOfCharInSentence {
		// TODO Auto-g
	
	public static void main (String[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your sentence");
		String s= scan.nextLine();
		String k = s.replaceAll("\\s", ""); // this is regular expression to remove all white space and tab 
		System.out.println(k);
		System.out.println(k.length());
        
      	
}
}
