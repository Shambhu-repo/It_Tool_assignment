package com.assignment_4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int remainder;
		int store=0;
		int input;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		input = sc.nextInt();
		int unchangedInput=input;
		sc.close();

		while(input>0){    
		   remainder=input%10; 
		   store=(store*10)+remainder;  
		   input /=10;
		  }
		  if(unchangedInput==store) {    
		   System.out.println("palindrome number "); 
		  }
		  else {   
		   System.out.println("not palindrome");    
		  
		}  
		  }
	}






