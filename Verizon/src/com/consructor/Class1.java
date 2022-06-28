package com.consructor;

import java.util.Arrays;

public class Class1 {
	
	int [] arr;
	String s;
	int i;
	
	public Class1(int [] arr, String s , int i) {
		this.arr=arr;
		this.s=s;
		this.i=i;
	}
	
	public Class1(int [] arr,  int i) {
		this.arr=arr;
		
		this.i=i;
	}

	@Override
	public String toString() {
		return "Class1 [arr=" + Arrays.toString(arr) + ", s=" + s + ", i=" + i + "]";
	}

}
