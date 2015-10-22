package com.example.course.builder;

public class AlertMessage {

	private String errorMessage;
	private int errorType;
	private int errorNo;
	
	public static class Builder {
		private String errorMessage;
		private int errorType;
		private int errorNo;
		
		public Builder setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
			return this;
		}
		
		public Builder setErrorType(int errorType) {
			this.errorType = errorType;
			return this;
		}
		
		public Builder setErrorNo(int errorNo) {
			this.errorNo = errorNo;
			return this;
		}
		
		public AlertMessage buildMessage() {
			return new AlertMessage(this);
		}
		
	}
	public AlertMessage(Builder builder) {
		this.errorMessage = builder.errorMessage;
		this.errorType = builder.errorType;
		this.errorNo = builder.errorNo;
	}
	
	public AlertMessage(String message, int errorType, int errorNO) {
		this.errorMessage = message;
		this.errorType = errorType;
		this.errorNo = errorNO;
	}
	
	public AlertMessage() {
		
	}
	
	@Override
	public String toString() {
		return "AlertMessage [errorMessage=]" 
		  + errorMessage + ", errorType=" 
		  + errorType + ", errorNo=" + errorNo + "]"; 
	}
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorType() {
		return errorType;
	}

	public void setErrorType(int errorType) {
		this.errorType = errorType;
	}

	public int getErrorNo() {
		return errorNo;
	}

	public void setErrorNo(int errorNo) {
		this.errorNo = errorNo;
	}

}
