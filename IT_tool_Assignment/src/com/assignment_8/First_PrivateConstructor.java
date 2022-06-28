package com.assignment_8;

public class First_PrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();

	}

}

  class  Sample{
	  
	  private Sample() {
		  System.out.println("display private constructor");
	  }
	 
 }
  
  // Constroctor can not be reached by out side of class . So it gives compile time error
