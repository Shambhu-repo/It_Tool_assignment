package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class ArrayTranspost {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter your row length");
		int row  =sc.nextInt();
		System.out.println("please Enter your column length");
		int col  =sc.nextInt();
		System.out.println("enter numbers for arry");

		int [][] transpose=new int[col][row];

	    int [][] original     =  new int [row][col];
	    
	    
	    
	    for(int i=0;i<row;i++) {     // populating original array
	    	for(int j=0;j<col;j++) {
	    		int  num = sc.nextInt();
	    	    original[i][j] = num;
	    	}
	    }
	    
	  
	    
	    
	    for(int i=0;i<original.length;i++) {   // transposing original to transpose array
	    	for(int j=0;j<original[0].length;j++) {
	    		transpose[i][j]= original[j][i];
	    	}
	    }
	    
		
	    System.out.println("printing original array");
	    for(int i=0;i<transpose.length;i++) {
	    	for(int j=0;j<transpose[0].length;j++) {
	    		int a= original[i][j];
	    		System.out.print(a + "");

	    	}
System.out.println();
	    }

	    
	    
	    
	    
	    System.out.println("printing transposed array");
	    for(int i=0;i<transpose.length;i++) {
	    	for(int j=0;j<transpose[0].length;j++) {
	    		int a= transpose[i][j];
	    		System.out.print(a + "");

	    	}
System.out.println();
	    }
	    

	}

	
}
