package com.assignment_3;

import java.util.Scanner;

public class Greatest_number {
	int x,y,z;
	int greatest;
public int greatest_Number(int x,int y,int z) {
	if((x>y) && (x>z)) {
		greatest = x;
	}
	else if(y>x && y>z) {
		greatest = y;
	}
	else {
	 greatest =z; 
	}
		
		return greatest;
	}

public  static void main(String []args) {
	Greatest_number gn = new Greatest_number();
	Scanner scan =new Scanner(System.in);
	System.out.println("Type first number");
	 int first = scan.nextInt();
	 System.out.println("Type second Number");
	 int second = scan.nextInt();
	 System.out.println("Type third Number");
	 int third = scan.nextInt();
	 scan.close();
	 
	int biggest = gn.greatest_Number(first, second, third);
	System.out.println("This is the greatest Number : "+biggest );
	 
	 
	
	
}

}
