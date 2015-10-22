package com.example.course.generics.example.second;

import com.example.course.generics.example.first.Box;

import java.util.ArrayList;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderPair<String, String>("hello", "world");
		Pair<ArrayList<String>, Character>  p3 = 
				new OrderPair<ArrayList<String>, Character>
			(new ArrayList<String>(), new Character('a'));
		
		System.out.println(p1.getValue());
		System.out.println(p1.getKey());
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
		System.out.println(p3.getKey());
		System.out.println(p3.getValue());
		
		
		//At compile time we know what is Key and Value from OrderPair class 
		OrderPair<String, Box<Integer>> p = new OrderPair<String, Box<Integer>>("primes", new Box<Integer>());
		Box<Integer> value = p.getValue();
		System.out.println(value.get());
	}

}
