package com.verizonInterface;

import java.util.List;

public class Class2 implements Koshis {

	@Override
	public void getname(List<String> l, String s) {
		  if(l.size()<2) {
		     	 l.add(s);
		      }
		      
		      for(String m : l) {
		     	 System.out.println(m + " from implemented class2");
		      }
	}
	
	
	
	
		

}
