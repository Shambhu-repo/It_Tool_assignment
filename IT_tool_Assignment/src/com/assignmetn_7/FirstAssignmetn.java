package com.assignmetn_7;

public class FirstAssignmetn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass ref1 = new Aclass(5);
		Aclass ref2 = new Aclass(10);
		System.out.println(ref1.add(ref2));


	}

}

class Aclass{
	private int x;
	 public Aclass(int x) {
		 this.x=x;
	 }
	 int add(Aclass ref) {
		 return x+ref.x;
	 }
}
// how the two 

// Answer is 15
