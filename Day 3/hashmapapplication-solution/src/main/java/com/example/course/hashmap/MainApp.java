package com.example.course.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {

	/**
	 */
	public static void main(String[] args) {
		String[]names = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g"};
		
		Map<String, Integer>hashMapData = new HashMap<String, Integer>();
		
		for (int i = 0; i < names.length; i++) {
			hashMapData.put(names[i], i);
		}
		
		System.out.println("Elements:"+hashMapData.size());
		
		if (hashMapData.containsKey("m")) {
			System.out.println("Elements exist");
		} else {
			System.out.println("Elements not exist");
		}
		
		Integer integer = hashMapData.get("w");
		System.out.println(integer);
		
		hashMapData.put("m", 25);
		hashMapData.put("m", 26);
		
		Collection<Integer> values = hashMapData.values();
		
		System.out.println("Ova e kluc : " + hashMapData.get("m"));
		for(Map.Entry<String, Integer> value : hashMapData.entrySet()) {
			System.out.println("Key:"+value.getKey()+" Value:"+value.getValue());
		}
		
		Set<String> keySet = hashMapData.keySet();
		
		System.out.println("----------------------------------------------------");		
		
		hashMapData.put("e", 14);
		
		for(Map.Entry<String, Integer> value : hashMapData.entrySet()) {
			System.out.println("Key:"+value.getKey()+" Value:"+value.getValue());
		}
		
	}
	

}
