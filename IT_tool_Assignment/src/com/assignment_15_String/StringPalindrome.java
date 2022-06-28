package com.assignment_15_String;

import java.util.Scanner;

public class StringPalindrome {
	
	static boolean checkPalindrome() {
		Scanner scan = new Scanner(System.in);
          String str;
		System.out.println("Enter your String");
		str = scan.nextLine();
		char[] c= str.toCharArray();
		boolean result=false;
		
		for(int i=0;i<c.length;i++) {
			for(int j=c.length-1;j>0;j--) {
				if(c[i]==c[j]) {
					result= true;
				}
				else {
					result=false;
				}
			}
		}
		return result;
		
	}
	
	public static void input() {
		
	}

	public static void main(String[] args) {
		boolean b =checkPalindrome();
		System.out.println(b);

		
	}

}
