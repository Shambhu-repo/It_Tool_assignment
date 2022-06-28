package com.consructor;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
Class1 c1 = new Class1(arr,"sitaram",2);
Class1 c2 = new Class1(arr,"sitaram",2);
System.out.println(c1);
System.out.println(c1.s);
System.out.println(c1.arr.length);

Class1 c3 = new Class1(arr,2);
System.out.println("second :" +c3.arr.length);

  
	}

}

