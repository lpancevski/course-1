package com.example.course.factory;

public class SenderFactory {
	
	private static final int SENDER_SMS = 0;
	private static final int SENDER_MMS = 1;
	private static final int SENDER_MAIL = 2;
	
	public static ISender getSenderInstance(int messageType) {
		ISender sender = null;
		
		switch (messageType) {
		case SENDER_SMS:
			sender = new SMSSender();
			break;
		case SENDER_MMS:
			sender = new MMSSender();
			break;
		case SENDER_MAIL:
			sender = new MailSender();
			break;

		default:
			break;
		}
		
		return sender;
	}

}
