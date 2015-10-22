package com.example.course.generics.example.first;

public class Box<T> {

	  private T t;

	  public void add(T t) {
	    this.t = t;
	  }

	  public T get() {
	    return t;
	  }
	  
	  public int getFuel() {
		  return 10;
	  }
}