package com.example.course.enumerators;

public enum MathOperation {
	
	LEVEL_1(1000), LEVEL_2(2000), LEVEL_3(4000),
	PLUS(1000), MINUS(5), ADD(7), MOD(50);
	
	private int mathOp;
	
	private MathOperation(int mathOp) {
		this.mathOp = mathOp;
	}
	
	public int getMathOp() {
		return this.mathOp;
	}
		
	public static MathOperation fromValue(int value) {
		for (MathOperation oper : values()) {
			if (oper.getMathOp() == value) {
				return oper;
			}
		}
		return null;
	}
}
