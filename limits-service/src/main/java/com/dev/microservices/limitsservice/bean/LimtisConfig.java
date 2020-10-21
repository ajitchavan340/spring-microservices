package com.dev.microservices.limitsservice.bean;

public class LimtisConfig {
	
	private int maximum;
	private int minimum;
	
	public LimtisConfig() {
		super();
	}
	public LimtisConfig(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	

}
