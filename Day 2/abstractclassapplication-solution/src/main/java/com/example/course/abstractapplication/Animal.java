package com.example.course.abstractapplication;

public abstract class Animal {
	
	private String animalName;
	public int animalAges;
	
	public void printAnimalName(){
		System.out.println("Animal name is: " + this.animalName);
	}
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String whatsMyName() {
		getAnimalAges();
		return this.animalName;
	}
	
	public abstract void setAnimalAges(int animalAges);
	public abstract int getAnimalAges();
	
}
