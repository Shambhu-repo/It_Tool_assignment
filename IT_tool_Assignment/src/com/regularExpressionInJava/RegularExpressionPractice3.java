package com.regularExpressionInJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { Scanner sc = new Scanner(System.in); while(true) {
		 * System.out.println("Enter regex pattern"); String regexpatteren =
		 * sc.nextLine(); Pattern pattern = Pattern.compile(regexpatteren); Matcher
		 * matcher = pattern.matcher("welcome to india peter"); boolean found = false;
		 * while(matcher.find()) { System.out.println(" i found the text :" +
		 * matcher.group() + " at index " + matcher.start() + " at ending Index :"+
		 * matcher.end()); found=true; } if(!found) {
		 * System.out.println(" no match found"); } // else {
		 * System.out.println("no match found"); //}
		 * 
		 * } } catch(Exception e) { System.out.println(e); }
		 */
		
		//RegularExpressionPractice3.checkStringInBuiltRegexMethod();
		//RegularExpressionPractice3.checkStringInBuiltRegexMethod1();
		RegularExpressionPractice3.testVerizonCode();

	}
	
	public static void  checkStringInBuiltRegexMethod() {
		String s = "new home";
		//boolean b = false;
		if(s.matches("[a-zA-Z\\s]*")) {
			System.out.println(" yes given string is according to provided regex : " + s);
		}
		else {
			System.out.println("no mathcing");
		}
		
	}
	
	public static void  checkStringInBuiltRegexMethod1() {
		String s = new String("new home");
		//boolean b = false;
		if(s.matches("[a-zA-Z\\s]*")) {
			System.out.println(" given string according to provided regex : " + s);
			String[] s1 =	s.split("\\s");
			System.out.println(s1);
			for(String sn :s1) {
				System.out.println("what we get in split method : " + sn);
			}
			//for(String sn:s1) {
			for(int i=0;i<s1.length;i++) {
				if(s1[i].matches("[a-zA-Z]*")) {
					System.out.println("got matches : " + s1[i]);
				}
				else {
					System.out.println(" split is not woriking");
				}
			}

		}
		else {
			System.out.println("yes mathcing");
		}
		
	}
	
	public static void testVerizonCode() {
		String m ="";
		String tx = "ramIs0TZuy TZNepal";
		String s = tx.replaceAll("[TZ]", " ").trim();
		System.out.println(s);
		if(s.contains("0")){
		m =	s.split("\\+")[0];

		}
		System.out.println("iam from split " + m);
		System.out.println("heteriaka");

	}

}
