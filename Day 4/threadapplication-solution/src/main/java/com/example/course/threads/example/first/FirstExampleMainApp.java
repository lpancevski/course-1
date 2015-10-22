package com.example.course.threads.example.first;

public class FirstExampleMainApp {

	public static void main(String[] args) {
		new SimpleThread("Jamaica").start(); 
        new SimpleThread("Fiji").start();
	}

}
