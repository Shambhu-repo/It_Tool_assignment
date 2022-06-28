package com.assignment_9_a_complex;

import java.util.Scanner;


public class DriverClass extends Support {
	static  int option;

	public static void main(String[] args) {


		do {
			initialization();
			option = scan.nextInt();

			switch(option) {
			case 1:   					printBill();  
			break;

			case 2:				     printBill();
			break;

			case 3:  			    printBill();
			}

		}				while(option!=0); 

		byeBye();


	}


}
