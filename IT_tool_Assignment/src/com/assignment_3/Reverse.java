package com.assignment_3;

import java.util.Scanner;

public class Reverse {
	int x=0;
	int reverse =0;
	
	public int reverse(int x) {
		while(x!=0) {
			reverse = reverse*10;
			reverse = reverse+x%10;
			x/= 10;
			
		}
		
		
		
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Reverse r = new Reverse();
	System.out.println("Enter number to reverse : ");
	Scanner scan = new Scanner(System.in);
	
	int number=scan.nextInt();
	 int  num = r.reverse(number);
	 scan.close();
System.out.println("Your reverse Number is : " + num);
	}

}
