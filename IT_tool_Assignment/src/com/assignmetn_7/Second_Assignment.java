package com.assignmetn_7;

public class Second_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass ref1 = new Aclass(5);
		Aclass ref2 = new Aclass(10);
		System.out.println(ref1.add(ref2));


	}

}

class Aclass{
	private int x;
	 private Aclass(int x) {
		 this.x=x;
	 }
	
	}

// This is compile time error


