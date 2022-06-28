package com.assignment_5;

import java.util.Scanner;

public class BinaryRepresentation {
	static int input;
	
    
	public static void main(String[] args) {  // need to give own logic
		binary();
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		input = sc.nextInt();
		sc.close();
}
		public static void binary() {
			input();
			int remainder[]= new int [10];
			int i=0;
			
		while(input!=0) {
		       remainder[i] = input%2;
		       input/=2;
		       i++;
		
		}
		for(int j=i-1;j>=0;j--) {
			System.out.println(remainder[j]);
}
	}
	
}
		
		 
		
			
			
			
			
			
			
			
			
			
			
		 
	
				
	


