package com.example.course.factory;

public class MailSender implements ISender {

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Mail message send");
	}

	@Override
	public void sendContact() {
		// TODO Auto-generated method stub
		System.out.println("Mail contact send");
	}

}
