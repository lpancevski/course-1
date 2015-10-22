package com.example.course.generics.example.first;


public class MainApp {

	public static void main(String[] args) {
	     Box<Integer> integerBox = new Box<Integer>();
	     Box<Car> carBox = new Box<Car>();
	     Box<String> stringBox = new Box<String>();
	    
	     integerBox.add(new Integer(10));
	     carBox.add(new Car());
	     stringBox.add("This is Some String");

	     System.out.printf("Integer Value :%d\n\n", integerBox.get());
	     System.out.printf("String Value :%s\n", carBox.get());
	     System.out.printf("String Value :%s\n", stringBox.get());
	     
	  }
}
