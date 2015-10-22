package com.example.course.delegate;

public class MainApp {

	
	public static void main(String[] args) {
        Delegator c = new Delegator();
        c.f();     // output: First: doing f()
        c.g();     // output: First: doing g()
        c.toSecond();
        c.f();     // output: Second: doing f()
        c.g();     // output: Second: doing g()
        
	}

}
