package com.assignment_15_String;

import java.util.Scanner;

public class EachFirstCharUppercase {
	
	public static void main(String[] arg) {
		
	
	Scanner in = new Scanner(System.in);
     System.out.println("Enter a sentence");
     String s = in.nextLine();
     
     s=" "+s; // added a space just before first word of sentence
	String finalResult ="";  // we will store here final string
	for(int i=0;i<s.length()-1;i++) {
		char ch = s.charAt(i);
		if(ch==' ') {
			finalResult = finalResult+ch;
			i++;
			ch=s.charAt(i);  // it will make every word's first char in upper case 
			finalResult=finalResult+Character.toUpperCase(ch);
		}
		else {
			finalResult=finalResult+ch;
		}
	}
	finalResult=finalResult.trim();
	System.out.println(finalResult);

	}	
	
}
