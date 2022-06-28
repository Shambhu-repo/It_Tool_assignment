package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class CheckSquare {
	
	static double num;
	static double a;
	static boolean flag=false;
	public static void takeInput() {
		Scanner scan = new Scanner(System.in);

		 System.out.println("Enter Your Number : \n");
		 num =scan.nextDouble();
		 scan.close();
	}
	
	public static boolean checkSquare(double input) {
		for(int i=1;i*i<=num;i++) {
			if(num%i==0&&num/i==i) {
				return true;
			}
		}
		return flag;
	}
public static void main(String[] args) {
		takeInput();
		if(checkSquare(num)) {
			System.out.println("Yes Number is perfect square");
		}
		else {
			System.out.println("No, Number is not perfect square");

		}
	
		
		

	}

}
