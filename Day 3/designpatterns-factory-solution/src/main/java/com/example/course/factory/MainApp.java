package com.example.course.factory;

public class MainApp {

	private static final int MESSAGE_TYPE = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISender messageSender = SenderFactory.getSenderInstance(MESSAGE_TYPE);
		messageSender.sendMessage();
		messageSender.sendContact();
		
	}

}
