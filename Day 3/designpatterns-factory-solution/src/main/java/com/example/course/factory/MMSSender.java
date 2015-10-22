package com.example.course.factory;

public class MMSSender implements ISender {

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("MMS message send");
	}

	@Override
	public void sendContact() {
		// TODO Auto-generated method stub
		System.out.println("MMS contact send");
	}

}
