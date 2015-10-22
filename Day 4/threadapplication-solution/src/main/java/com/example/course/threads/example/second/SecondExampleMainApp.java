package com.example.course.threads.example.second;

import java.util.LinkedList;
import java.util.List;


public class SecondExampleMainApp {

	private static String[]qwertyArray = {"q","w","e","r","t","y"};
	private static List<QObject>list = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		list = new LinkedList<QObject>();
		
		Thread[] threadArray = new Thread[100];
		
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThreadClass(i, "Thread" + i, list, qwertyArray);
		}
		
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
		
		for (int i = 0; i < threadArray.length; i++) {
			// The join() method of a Thread instance can be used to "join" the start of a thread's 
			// execution to the end of another thread's execution so that a thread will not start 
			// running until another thread has ended. If join() is called on a Thread instance, 
			// the currently running thread will block until the Thread instance has finished executing.
			threadArray[i].join();
		}
		
		for (QObject qObject : list) {
			System.out.println("ID:"+qObject.getId()+" NAME:"+qObject.getName());
		}
		
	}
	
}
