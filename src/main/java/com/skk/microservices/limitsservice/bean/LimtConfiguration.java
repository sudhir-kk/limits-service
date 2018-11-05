package com.skk.microservices.limitsservice.bean;

public class LimtConfiguration {
	private int maximum;
	private int minimum;
	
	protected LimtConfiguration() {}
	
	public LimtConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
