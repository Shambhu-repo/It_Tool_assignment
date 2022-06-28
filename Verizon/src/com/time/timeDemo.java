package com.time;

import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startTimemyglogs();

	}
	public static void startTimemyglogs() {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				Date d = new Date();
				System.out.println(d);
				System.out.println("hi tina");
			}
			
		}, 4000,5000);
	}
}
