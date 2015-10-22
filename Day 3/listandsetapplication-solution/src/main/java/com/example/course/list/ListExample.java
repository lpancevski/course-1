package com.example.course.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		String [] names= {"q","w","e","r","t"};
		
		List<String> listOfNames = new LinkedList<String>();
		
		for (int i = 0; i < names.length; i++) {
			listOfNames.add(names[i]);
		}
		System.out.println(listOfNames.size());
		
		
		for (String string : listOfNames) {
			System.out.println("Element value is: " + string);
		}
		
		listOfNames.add("Test1");
		listOfNames.add("Test2");
		listOfNames.add("Test3");
		listOfNames.add("Test4");
		listOfNames.add("Test5");
		listOfNames.remove(3);
		
		System.out.println(listOfNames.size());
		
		if (listOfNames.contains("Test1")) {
			System.out.println("Great");
		}
		
		Collections.sort(listOfNames, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});
	}
	
}

