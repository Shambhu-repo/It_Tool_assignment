package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class ArrayuniqueElement2 {
	static int len;
	static int [] arr;
	
	public static  void input() {  // passing array as parameter
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		    len = Integer.parseInt(scan.nextLine());
		    arr = new int[len];
		   
		   System.out.println("Enter Numbers");
		   for(int i=0;i<len;i++) {
			arr [i] = Integer.parseInt(scan.nextLine());  // creates array with elements
		
		}
		   giveUnique();   
	}

	public static void main(String[] args) {
	input();
		
		
	}
	
	public static int[] giveUnique() {   // return 
		
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
				unique1[k]=arr[i];
				k++;
					
				}
			}
		for(int i=0;i<k;i++) {
			System.out.println(unique1[i] + "");
			
		}
		
 return unique1;

		
	}
	
	
	}





