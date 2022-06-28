package com.assignmetn_7;

public class Third_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass ref1 = new Aclass(5);
		Aclass ref2 = new Aclass(10);
		System.out.println(ref1.add(ref2));


	}

}

class Aclass{
	protected int x;
	 
	Aclass(int x) {
		 this.x=x;
	 }
	Aclass(int y) {
		 this.x=y;
	 }
	
	 
//compiletime error 

	}


