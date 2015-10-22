package com.example.course.abstractapplication;

public class Cat extends Animal {

	@Override
	public void setAnimalAges(int animalAges) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAnimalAges() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String whatsMyName() {
		return super.whatsMyName().concat(" other name");
	}

}
