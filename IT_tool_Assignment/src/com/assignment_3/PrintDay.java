package com.assignment_3;

import java.util.Scanner;

public class PrintDay {
	
	
	public void print_day(int day) {
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Sorry  !! Check the instruction");
		
			
		}
		
	}

	public static void main(String[] args) {

		PrintDay pd = new PrintDay();
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter <1> for Sunday%nEnter <2> for Monday%nEnter <3> for Tuesday%nEnter <4> for Wednesday"
				+ "%nEnter <5> for Thrusday%nEnter <6> for friday%nEnter<7> for Saturday : -> ");
		
		int day = scan.nextInt();
		pd.print_day(day);
		scan.close();
		
		
		
	}

}
