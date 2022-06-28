package com.assignment_3;

import java.util.Scanner;

public class EvenOrOdd {
	
public int find_odd_even(int x) {
		if(x%2==0) {

			System.out.println("Entered Number is even");
		}
		else {
			System.out.println(" Entered Number is Odd");
		}
		return x;
		
	}

	public static void main(String[] args) {
 
		EvenOrOdd ed = new EvenOrOdd();
 
 Scanner scan = new Scanner(System.in) ;
 
 System.out.println("Enter Your Number");
 
 int number = scan.nextInt();
 
 scan.close();
 
 ed.find_odd_even(number);

 
	 

	
	
	}
		

	

}
