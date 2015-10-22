package com.example.course.delegate;


public class Delegator implements DelegatorInterface {
    // delegation
    DelegatorInterface i = new FirstClass();
 
    @Override
    public void f() {
    	i.f();
    }
    @Override
    public void g() {
    	i.g();
    }
    
    // normal attributes
    public void toFirst() { i = new FirstClass(); }
    public void toSecond() { i = new SecondClass(); }
    
}

