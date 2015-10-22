package com.example.course.runnable.example.first;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println("I�m a worker thread");
	}
	
}
