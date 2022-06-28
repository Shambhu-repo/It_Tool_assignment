package com.assignment_13_algorithmPractice;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row :");
	     int row=	sc.nextInt();
	
	   System.out.println("Enter Col :");
	    int col=	sc.nextInt();
	
		
		
		int [][] mat =takeInput(sc, row, col);
		pirntMatrix(mat);
		

	}
	
	public static void pirntMatrix(int[][]mat) {
		for(int i =0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {   // mat[0].length = provides length of column of array
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();

		}
	}
	
	public static int[][] takeInput(Scanner scn , int row,int col){
	int mat[][] = new int[row][col];
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.println("Enter the value");
			int value=scn.nextInt();
			mat[i][j]=value;
		}
	}
               return mat;
		
	}

}
