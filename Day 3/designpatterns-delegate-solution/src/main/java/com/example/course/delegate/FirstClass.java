package com.example.course.delegate;

public class FirstClass implements DelegatorInterface {

	@Override
	public void f() {
		System.out.println("First: doing f()");
	}

	@Override
	public void g() {
		System.out.println("First: doing g()");
	}
	
}

