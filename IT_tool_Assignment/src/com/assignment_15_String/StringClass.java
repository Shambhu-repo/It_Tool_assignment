package com.assignment_15_String;

public class StringClass {

	public static void main(String[] args) {
		String let ="abcdefghij";
		System.out.println(":%s3.3:\n" + let);
		
		
		
		String string = "namaskar-Hello";
		String h =splitmetod(string);
		System.out.println(" from h : " +h);
		
		findlength(string);
		splitmetod1(string);
		
	}
	
	public static String  splitmetod(String s) {
		// TODO Auto-generated method stub
		//String s = "namaskar";
		String [] k = s.split("-");
		String  l= "";
		for(int i =0;i<k.length;i++) {
			l = k[i];
			//System.out.println(l);
			
		}
		//System.out.println(l);
		return l;

	}

	
	public static void findlength(String m) {
	String k =	splitmetod(m);
	int n = k.length();
	System.out.println("findlength() " +n);
		
	}
	
	public static void  splitmetod1(String s) {
		// TODO Auto-generated method stub
		//String s = "namaskar";
		String [] k = s.split("-");
		String l=" ";
		for(int i =0;i<k.length;i++) {
			//l = k[i];
			System.out.println("splitmetod1 " +k[i]);
		}
		
	}


}
