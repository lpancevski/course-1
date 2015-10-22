package com.example.course.runnable.example.first;


public class FirstExampleMainApp {

	public static void main(String args[]) {
		Runnable runner = new Worker();
		Thread thrd = new Thread(runner);
		thrd.start();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I�m the main thread");
		
		Thread temp = new Thread() {
			public void run() {
				
			}
		};
		temp.start();
	}


}
