package com.example.course.hello;

public class Employee extends Person {


	private String department;
	private int salary;

	public Employee(String conName, String conSurname, String depart, int sal) {
		super(conName, conSurname);
		this.department = depart;
		this.salary = sal;
	}
	
	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}

}
