package com.assignment_8;

public class Third_Parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class Parent {
	 public Parent() {
		 System.out.println("No args constructor parent");
	 }
	
}
 
 
 class Child extends Parent{
	 public Child() {
		 this("jit");
	 }
	 
 }
 // compile time error
 // qn > 4 : no
