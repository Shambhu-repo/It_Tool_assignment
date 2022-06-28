package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = sc.nextInt();
		if(findplaindrome(input)) {
			System.out.println(input + " is plaindrome");
		}
		else {
			System.out.println(input + " is not plaindrome");
		}
		sc.close();
	}

	public static boolean findplaindrome(int input) {
		int unchangedInput=input;
		int remainder=0;
		int store=0;

		while(input>0){ 
			remainder=input%10; 
			store=(store*10)+remainder;  
			input /=10;
		}
		if(unchangedInput==store) {
			return true;
		}
		else { 
			return false;

		} 

	}
}






