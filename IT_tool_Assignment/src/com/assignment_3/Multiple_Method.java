package com.assignment_3;

import java.util.Scanner;

public class Multiple_Method {
	
	public int multiply(int a , int b) {
		int c = a*b;
		return c;
		
		
	}
	
	public void takeInput() {
		System.out.println("Multiplication Calculator ");
		System.out.println("***************************");

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter First number");
		int x =scan.nextInt();
		System.out.println("Enter Second Number");
		int y =scan.nextInt();
		
		int multiplication = multiply(x,y);
		System.out.println("Your Answer is : " + multiplication);
		
		scan.close();
		
	}
	
	public void print() {
		takeInput();
		
	}

	public static void main(String[] args) {
		
		Multiple_Method mm =  new Multiple_Method();
		mm.print();
		
	}

}
