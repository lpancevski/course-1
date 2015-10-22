package com.example.course.delegate;

public class SecondClass implements DelegatorInterface {

	@Override
	public void f() {
		System.out.println("Second: doing f()");
	}

	@Override
	public void g() {
		System.out.println("Second: doing g()");
		
	}
	

}