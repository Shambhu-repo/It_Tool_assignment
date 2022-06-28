package com.assignment_4;

import java.util.Scanner;

public class Factorial {
	
	
	
	public static void takeInput() {
		System.out.println("Type any number for factorial calculation : -> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int result = factorial(input);
		System.out.println("Result : Factorial for " + input + " is : -> "+  result);
	}
	
	public static int factorial(int num) {
		if(num==0) {    // I think no factorial for negative number ...so 
			return 1;   // factorial for 0 is 1 .....
		}
		else {

		return (num*(factorial(num-1))); // factorial method will call itselt untill it reaches upto num==0
	}
	}
	
	

	public static void main(String[] args) {
		
	takeInput();

	}

}
