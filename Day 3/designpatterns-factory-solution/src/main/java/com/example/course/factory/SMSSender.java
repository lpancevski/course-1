package com.example.course.factory;

public class SMSSender implements ISender {

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("SMS message send");
	}

	@Override
	public void sendContact() {
		// TODO Auto-generated method stub
		System.out.println("SMS contact send");

	}

	

}
