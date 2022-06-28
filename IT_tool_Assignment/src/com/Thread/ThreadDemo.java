package com.Thread;

public class ThreadDemo extends Thread {
	int count =0;
	public boolean _run = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo();
		td.run();
		
	}
	
	public void run() {
		while(_run) {
			if(count<100) {
			System.out.println(" invoking runThread method");
			runThread();
			}
			else {
				System.out.println("System is being termineted ");
				System.exit(0);
			}
		}
	}
	
	public void runThread() {
		try {
			int a =5;
			int b =6;
			int c = a+b;
			++count;
			System.out.println("addition : "+  c + " count : " + count);

			
		}
		catch(Exception e) {
			System.out.println(" exception occured : " + e);
		}
	}

}
