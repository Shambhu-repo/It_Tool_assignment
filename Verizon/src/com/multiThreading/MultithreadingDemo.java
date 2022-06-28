package com.multiThreading;

public class MultithreadingDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithreadingDemo md = new MultithreadingDemo();
		MultithreadingDemo md1 = new MultithreadingDemo();
		MultithreadingDemo md2 = new MultithreadingDemo();
		md.start();
		md1.start();
		md2.start();
		

	}

	/* @Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" my name is " + i )
		}   
		
		boolean _operate = true;
		while(_operate) {
			String s = findName();
			synchronized(s) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		}
			
				
			}  */
	
	
	@Override
	public void run() {
		 findName();
			
				
			}
		
	public String findName() {
		String s = "";
		for(int i=0;i<5;i++) {
			System.out.println(" my name is " + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return s;
	}

}
