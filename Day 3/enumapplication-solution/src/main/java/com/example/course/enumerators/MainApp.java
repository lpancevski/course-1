package com.example.course.enumerators;



public class MainApp {
	
	public static void main(String[]args) {
		
		MathOperation mathOp = MathOperation.ADD;
		
		System.out.println(mathOp.getMathOp());
		
		int sum = 0;
		
		int a = 5;
		int b = 10;
		
		switch (mathOp) {
		case PLUS:
			sum = a + b;
			break;			
		case MINUS:
			sum = a - b;
			break;			
		case ADD:
			sum = a * b;
			break;			
		case MOD:
			sum = a / b;
			break;
		default:
			break;
		}
		
		System.out.println("The for used operation is:"+sum);
		
		for (MathOperation mathOpp : MathOperation.values()) {
			System.out.println("Operator:"+mathOpp+" value:"+mathOpp.getMathOp());
		}
		
		MathOperation fromValue = MathOperation.fromValue(2);
		System.out.println(fromValue);
	}
	
}
