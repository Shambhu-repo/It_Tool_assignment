package com.assignment_15_String;

import java.util.Scanner;

public class ReverseWords {
	
	
	public static void reverseSentence(String[] arr) {
      	
      	for(int i =arr.length-1; i>=0; i--) {
      		System.out.print(arr[i]+" ");
        			
	}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write  a sentence");
         String	str=	scan.nextLine();
      	String [] s= str.split("\\s+");  
      	     
      	reverseSentence(s);
	
	
	}

}
