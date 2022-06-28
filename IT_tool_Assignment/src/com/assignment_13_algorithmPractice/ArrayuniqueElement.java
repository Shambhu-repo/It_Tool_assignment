package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class ArrayuniqueElement {

	public static void main(String[] args) {
		
	
	
     Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	   int len = Integer.parseInt(scan.nextLine());
	   int [] arr = new int[len];
	   
	   System.out.println("Enter Numbers");
	   for(int i=0;i<len;i++) {
		arr [i] = Integer.parseInt(scan.nextLine());  // creates array with elements
	
	}
	
	int unique1 []=new int[len];  // get unique element from arr[];
	int k=0;
	

	for(int i=0;i<arr.length;i++) {
		//int flag=0;
		boolean flag=true;

		for(int j=0;j<i;j++) {
			if(arr[i] ==arr[j]) {
//flag=1;				
flag=false;
break;
}
	}
		
		//if(flag==0) {
		if(flag==true) {
			unique1[k]=arr[i];    // transfering element from arr[] to unique1[] with incremnted k++ ;
			k++;
				
			}
			
			
		}
		
	
	
	for(int i=0;i<k;i++) {
		System.out.println(unique1[i] + "");
		
	}
	

}
}


