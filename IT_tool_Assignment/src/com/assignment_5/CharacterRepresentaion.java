package com.assignment_5;

import java.util.Scanner;


public class CharacterRepresentaion {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
	    int num=	scan.nextInt();
	  //  Character k =  Character.forDigit(0,num);
	    char c = (char)(num);
	    System.out.println(c);
	    scan.close();
	    
	    


	}

}
