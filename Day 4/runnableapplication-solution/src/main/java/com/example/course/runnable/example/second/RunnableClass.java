package com.example.course.runnable.example.second;

import java.util.LinkedList;
import java.util.List;

public class RunnableClass implements Runnable {

	private Integer threadID;
	private String[] values;
	private static Object object = new Object();
	private static List<QObject>list = new LinkedList<QObject>();
	
	public RunnableClass(Integer threadID, String[] values, List<QObject> list2) {
		this.threadID = threadID;
		this.values = values;
		this.list = list2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (object) {
			for (int i = 0; i < values.length; i++) {
				QObject qObject = new QObject(new Integer(i), values[i]);
				qObject.threadId = this.threadID;
				list.add(qObject);
			}
		}

		//TODO Check situation when object is not in synchronized block
		
		/*for (int i = 0; i < values.length; i++) {
			QObject qObject = new QObject(new Integer(i), values[i]);
			qObject.threadId = this.threadID;
			list.add(qObject);
			System.out.println("THREADID:" + qObject.threadId + " ID:"+qObject.getId()+" VALUE:"+qObject.getName());
		}*/
	}

}
