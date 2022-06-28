package com.assignment_5;

import java.util.Scanner;

public class Calculator {
	static double num1;
	static double num2;
	static double num3;
	static String operator;

	static Scanner scan = new Scanner(System.in);

	public static void takeinput() {
		System.out.println("Enter your first Number");
		num1 = scan.nextDouble();
		System.out.println("Enter operator");
		operator = scan.next();
		System.out.println("Enter your Second number");
		num2 = scan.nextDouble();
	}

	public static void add(double n, double n2) {
		takeinput();
		if (operator.equals("+")) {
			num3 = num1 + num2;
			System.out.println("*************************");
			System.out.println("Your Answer is : " + num3);
			System.out.println("*************************");
		} else {
			System.out.println("follow instruction");
		}
}

	public static void subtraction(double n, double n2) {
		takeinput();
		if (operator.equals("-")) {
			num3 = num1 - num2;
			System.out.println("*************************");
			System.out.println("Your Answer is : " + num3);
			System.out.println("*************************");
		} else {
			System.out.println("follow instruction");
		}
}

	public static void divide(double n, double n2) {
		takeinput();
		if (operator.equals("/")) {
			num3 = num1 / num2;
			System.out.println("*************************");
			System.out.println("Your Answer is : " + num3);
			System.out.println("*************************");
		} else {
			System.out.println("Follow instruction");
		}
}
public static void multiply(double n, double n2) {
		takeinput();
		if (operator.equals("*")) {
			num3=num1 * num2;
			System.out.println("*************************");
			System.out.println("Your Answer is : " + num3);
			System.out.println("*************************");

		} else {
			System.out.println("******Follow instruction********");
		}
}

	public static void application() {
	//	boolean quit = false;
		int quit1 =0;
		int choice=0;
		String menu ="Welcome to Calculator :\n \nEnter <1> Addition \nEnter <2> for "
				+ "Subtraction\nEnter <3> for Multiplicatin\nEnter <4> for Division";

		do {
			System.out.println(menu);
			System.out.println("Enter your choice");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Add two numbers");
				add(num1, num2);
				break;

			case 2:
				System.out.println("Subtract two numbers");
				subtraction(num1, num2);
				break;

			case 3:
				System.out.println("Multiply two numbers");
				multiply(num1, num2);
				break;
			case 4:
				System.out.println("Divide two numbers");
				divide(num1, num2);
				break;

			default:
				System.out.println("sorry you entered wrong number");
			}
		}
		//while (choice ==0);
		while(quit1==0);  // it will get back to main menu after each case is completed.
}
public static void main(String[] args) {
		application();

	}

}
