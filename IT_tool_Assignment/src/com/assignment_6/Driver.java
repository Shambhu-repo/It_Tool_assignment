package com.assignment_6;


import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	boolean quit=false;
	//int choice=0;
do {
		System.out.println("******************************************************************************");
	    System.out.println("********Enter <1> for Student's Form \nEnter <2> for Student List\n"
	    		+ "Enter <3> for keeping Record for Collegen\nEnter <4> for List of College"
	    		+ "\nEnter \"quit\" to leave the page\n\n\nEnter Your Choice****");
		int choice=scan.nextInt();
		 switch(choice) {
	    case 1:         Service.newStudent();
          break;
	    case 2:
	    	Service.printStudent();
	    	
	    	break;
	    
	    case 3:
	    	Service.collegeInfo();
	    	break;
	    	
	    case 4:
	    	Service.printCollege();
	    	break;
	    	
	    	default :
	    		System.out.println("Sorry follow instruction !! ");
	    }
	}
	while(!quit);
scan.close();
}
}
