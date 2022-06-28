package com.assignment_13_algorithmPractice;

import java.io.BufferedReader;
import java.util.Scanner;

public class ArrayMinAndMaxValue {
	
	public static void greateAndSmaller() {
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter length of array");
		int len = Integer.parseInt(scan.nextLine());
		int []arr=new int[len];
		
//		int maximum=arr[0]; 
//		int minimum=arr[0]; 
//		
		int maximum=Integer.MIN_VALUE; 
		int minimum=Integer.MAX_VALUE; 
		
		System.out.println(maximum);
		System.out.println(minimum);




		System.out.println("Length of your array is : " + len + "\nplease Enter numbers");
           for(int i=0;i<len;i++) {
			arr[i]=Integer.parseInt(scan.nextLine());
		}

		for(int i=0;i<arr.length;i++) {
				if(arr[i]>maximum) {
					maximum=arr[i];
				}
				else if(arr[i]<minimum) {
					minimum=arr[i];
				}
				
						}
	
System.out.print("Maximum Number You entered :  "+ maximum +  "  Minimum Num You entered : " + minimum);
	
	}


	public static void main(String[] args) {
	   greateAndSmaller();
	
	}

}
