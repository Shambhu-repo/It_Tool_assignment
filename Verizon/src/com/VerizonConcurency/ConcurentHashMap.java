package com.VerizonConcurency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMap implements Runnable {
	Keho k = null;
	ConcurrentHashMap<String,String> chm1= new ConcurrentHashMap<String,String> ();
	Keho k1 = (Keho) new ConcurrentHashMap<String,String> ();
	Keho k2 = (Keho) new HashMap<String,String>();
	
 
	
	public static void main (String[] arr) {
		
		
		
		
	}


	@Override
	public void run() {
		
		
	}
	

}
