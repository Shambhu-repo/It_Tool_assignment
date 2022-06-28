package com.assignment_13_algorithmPractice;

public class FindNumberInArray {

	public static void main(String[] args) {

		
		int [] arr = new int[5];
		arr[0]=9;
		arr[1]=38;
		arr[2]=23;
		arr[3]=17;
		arr[4]=70;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==17) {
				int a=arr[i];
				System.out.println("index :" + i + "value : " + a);
			}
		}


	}

}
