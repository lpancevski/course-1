package com.example.course.designpatterns.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		WashingMachine washingMachine = new WashingMachine();
		washingMachine.initMachine();
		
		washingMachine.checkState();
		washingMachine.changeMachineState();
		
		(WashingMachineEngine.getInstance()).checkEngineState();
		
		WashingMachine washingMachine2 = new WashingMachine();
		washingMachine2.initMachine();
		washingMachine2.checkState();
		
	}
	
}
