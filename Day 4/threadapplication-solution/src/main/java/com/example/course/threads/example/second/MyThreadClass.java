package com.example.course.threads.example.second;

import java.util.List;


public class MyThreadClass extends Thread {

	private Integer id;
	private String name;
	
	private List<QObject>list = null;
	private String[]qwertyArray;
	
	private static Object object = new Object();
	
	public MyThreadClass(Integer id, String name, List<QObject> list,
			String[] qwertyArray) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.qwertyArray = qwertyArray;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		synchronized (object) {
			for (int i = 0; i < qwertyArray.length; i++) {
				list.add(new QObject(id, name + "" +qwertyArray[i]));
			}
		}
		
		
	}
	
	
	
	
}
