package com.example.course.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		String [] names= {"q","w","e","r","t","q","w"};
		
		Set<String> setOfNames = new HashSet<String>();
		
		for (int i = 0; i < names.length; i++) {
			setOfNames.add(names[i]);
		}
		
		System.out.println(setOfNames.size());
		
		for (String string : setOfNames) {
			System.out.println("Element value is: " + string);
		}
		
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test1");
		setOfNames.add("Test2");
		setOfNames.add("Test3");
		setOfNames.add("Test4");
		setOfNames.add("Test5");
		
		for (String string : setOfNames) {
			System.out.println("Element value is: " + string);
		}
		
		System.out.println(setOfNames.size());
		
		if (setOfNames.contains("Test1")) {
			System.out.println("Great");
		}

		
	}
}
