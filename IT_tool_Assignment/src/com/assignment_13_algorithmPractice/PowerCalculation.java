package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class PowerCalculation {
	
	public static void takeInput() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number");
     int firstNum=	sc.nextInt();
     System.out.println("Enter Second Number");
     int SecondNum=	sc.nextInt();
     sc.close();
     
     double power = calculation(firstNum,SecondNum);
     System.out.println("Result  : -> " + firstNum + " to Power " + SecondNum + " is : -> " + power );
	
	}
	
	public static double calculation(int a,int b) {
		
        double result =  Math.pow(a, b);

		
		return result;
	}
	

    

	public static void main(String[] args) {
                takeInput();	
		 
	     
		
		

	}

}
