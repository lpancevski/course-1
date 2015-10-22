package com.example.course.designpatterns.singleton;

public class WashingMachineEngine {

	private static final String ENGINE_ON = "ON";
	private static final String ENGINE_OFF = "OFF";
	
	private String engineState;
	
	private WashingMachineEngine() {
		
	}
	private static WashingMachineEngine instance = null;
	
	public static WashingMachineEngine getInstance() {
		
		if (instance == null) {
			instance = new WashingMachineEngine();
		}
		
		return instance;
		
	}
	
	public void initEngine() {
		this.engineState = ENGINE_OFF;
	}
	
	public void changeEngineState() {
		if (this.engineState.equals(ENGINE_OFF)) {
			this.engineState = ENGINE_ON;
		} else {
			this.engineState = ENGINE_OFF;
		}
	}
	
	public void checkEngineState() {
		System.out.println("Engine is: " + this.engineState);
	}
	
}
