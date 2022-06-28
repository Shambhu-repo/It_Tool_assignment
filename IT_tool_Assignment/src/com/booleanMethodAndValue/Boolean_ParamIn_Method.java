package com.booleanMethodAndValue;

public class Boolean_ParamIn_Method {
	
	public static int add(int a,int b, boolean age) {
		age=false;
		int c;
		if(age) {
			c=a+b;
		}
		else {
			c=0;
		}
		return c;
		
	}
	
	public static boolean getAge(int age) {
		if(age<21) {
			System.out.println("Sorry ! i can not  donate , I am minor . I am only : " + age + " years old ");
			return true;
		}
		else {
			System.out.println("yes i can do it ,  I am adult . I am  : " + age + " years old ");
			return false;
		}
		
	}
	public static void main(String[] arrays) {
		
		boolean age = getAge(24);
		
		int donation =add(10,20,age);
		int donation1 =add(10,20,getAge(24)); // we can pass method as parameter

		System.out.println(donation);
		System.out.println(donation1);

		
	}


}

