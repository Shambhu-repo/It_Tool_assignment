package com.assignment_13_algorithmPractice;

import java.util.Scanner;


public class SortingArry {
	static String enter ="Please put length for arry";


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int option;  

		do {
			System.out.println("Enter <1> for Ascending /nEnter <2> For descending");
			option=s.nextInt();
			switch(option) {
			case 1:  	assecending(s);
			break;
			case 2: 
				discending(s);

			}

		}while(option==0);


	}

	public static void assecending(Scanner s) {
		System.out.println(enter);		
		int len = s.nextInt();
		int [] b = input(s, len);

		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {

				int temp=0;
				if(b[i]>b[j]) {
					temp=b[i];
					b[i] = b[j];
					b[j] = temp;

				}
			}
			System.out.println(b[i]);		
		}
	}


	public static void discending(Scanner s) {
		System.out.println(enter);
		int len = s.nextInt();
		int [] b = input(s, len);
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				int temp=0;
				if(b[j]>b[i]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;

				}

			}

			System.out.println(b[i]);		

		}
	}


	public static int[] input(Scanner scan,int length) {
		int[] sort=new int[length];
		System.out.println("Put numbers");

		for(int i=0;i<length;i++) {
			int value =scan.nextInt();
			sort[i] =value;

		}

		return sort;

	}



}
