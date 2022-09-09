package com.sonata.interfaceexample;

public interface Machine {
	String speedup();
	String speeddown();
	default String TurnonAlarm() {
		return "Turning on The alarm";
		
	}
	
	default String TurnoffAlarm() {
		return "Turning off The alarm";
		
	}
	
	

}
