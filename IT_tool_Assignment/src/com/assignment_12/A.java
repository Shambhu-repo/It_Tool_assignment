package com.assignment_12;

 interface A {
	  void myMethod();

}

class B{
	public void myMethod() {
		System.out.println("myMethod");
		
	}
}

class C extends B implements A{
	
}

