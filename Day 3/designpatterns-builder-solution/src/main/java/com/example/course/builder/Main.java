package com.example.course.builder;

public class Main {

	public static void main(String[] args) {
		AlertMessage message = new AlertMessage.Builder().
				setErrorType(0).
				setErrorNo(101).
				setErrorMessage("No message").
				buildMessage();
		
		
		AlertMessage message1 = new AlertMessage();
		message1.setErrorMessage("");
		message1.setErrorNo(1);
		message1.setErrorType(2);
		
	}
}
