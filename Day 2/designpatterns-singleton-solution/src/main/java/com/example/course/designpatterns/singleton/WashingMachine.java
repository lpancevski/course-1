package com.example.course.designpatterns.singleton;

public class WashingMachine {
	
	private WashingMachineEngine engine = null;
	
	public void initMachine() {
		engine = WashingMachineEngine.getInstance();
		engine.initEngine();
	}
	
	public void checkState() {		
		WashingMachineEngine.getInstance().checkEngineState();
	}

	public void changeMachineState() {
		(WashingMachineEngine.getInstance()).changeEngineState();
	}
		
}
