package com.datastructure;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedListWithHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("ram","first");
    hm.put("hari","second");
    hm.put("shyam","third");
    hm.put("shambu","forth");
    
    LinkedList<HashMap> ll = new LinkedList<HashMap>();
    ll.add(hm);
    
    for(HashMap try12:ll) {
    	System.out.println("####### " + try12);
    	System.out.println("####### " + try12.get("ram"));
    	HashMap<String,String> obj = try12;
    	System.out.println(" +++++++ " + obj.get("ram" ));
    	while(obj.containsKey("shyam")) {
    		System.out.println("This is shyam raj");
    		break;
    	}
    }
    
    for(int i=0;i<ll.size();i++) {
    System.out.println("   second loop " + ll.get(i).get(hm.get("hari")));
    
    }
	}

}
