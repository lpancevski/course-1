package com.example.course.hello;


public class Person {

	public String name;
	public String surname;
	Integer age;
	Dog mydog;

	public Person(String conName, String conSurname) {
		this.name = conName;
		this.surname = conSurname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age  = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Dog getMydog() {
		return mydog;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setMydog(Dog mydog) {
		this.mydog = mydog;
	}
	
}
