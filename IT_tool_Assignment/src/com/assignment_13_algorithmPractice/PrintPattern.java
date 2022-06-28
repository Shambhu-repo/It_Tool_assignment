package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your number");
		int row = scan.nextInt();
		scan.close();

		for(int i=0;i<row;i++) {   // it is for row 


			for(int j=0; j<=i;j++) {      // it is for column
				System.out.print("* ");  
				
			}
			System.out.println();  // when nested loop exit ...this line takes to new line


		}
		
		
	}

}
