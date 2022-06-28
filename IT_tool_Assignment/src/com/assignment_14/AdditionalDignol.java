package com.assignment_14;

import java.util.Scanner;

public class AdditionalDignol {
	static 		Scanner scan = new Scanner(System.in);
	


	public static void main(String[] args)  {

		System.out.println("please Enter row no ");
		int row = scan.nextInt();
		System.out.println("please Enter col no ");
		int col = scan.nextInt();

		int result = addDignol(row, col);
		System.err.println("Result : " + result);
	}

	public static int [] [] input( int row,int col){

		int[][] d = new int[row][col];

		for( int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("please put numbers");
				d[i][j] =scan.nextInt();
			}
		}
		return d;
	}

	public static void printOringinalArray(int row ,int col) { // how to print this
		int [][] printArr = input(row,col);
		int a=0;
		for( int i =0;i<printArr.length;i++) {
			for(int j=0;j<printArr.length;j++) {
				a =	printArr[i][j];
				System.out.print(a + " \t");

			}
			System.out.println(" ");
		}


	}
	public static int addDignol(int row,int col) {

		int [][] a= input(row,col);
		int sum = 0;
		for(int i=0;i<row;i++) {

			for(int j=0;j<col;j++) {
				if(a[i]==a[j]) {
					sum+=a[i][i]*a[i][i] ;
				}
			}
		}

		return sum;

	}



}

