package com.example.course.runnable.example.second;

import java.util.LinkedList;
import java.util.List;


public class SecondExampleMainApp {

	private static String[]values = {"q","w","e","r","t","y","q","w","e","r","t","y","q","w","e","r","t","y","q","w","e","r","t","y"};
	private static List<QObject>list = new LinkedList<QObject>();
	private static Integer threadID;
	
	public static void main(String[] args) {
		Thread[]thread = new Thread[100];
		
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(new RunnableClass(i, values, list));
		}
		
		for (int i = 0; i < thread.length; i++) {
			thread[i].start();
		}
		
		for (int i = 0; i < thread.length; i++) {
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("FINISHED WITH RUNNING");
		
		for(QObject qObject : list) {
			System.out.println("THREADID:" + qObject.threadId + " ID:"+qObject.getId()+" VALUE:"+qObject.getName());
		}
		
	}

}
