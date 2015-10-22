package com.example.course.runnable.example.second;

public class QObject {
	private Integer id;
	private String name;
	
	public Integer threadId;
	
	public QObject(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
