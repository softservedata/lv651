package com.softserve.edu.hw06
;

public abstract class Car {
	private String model;
	private int maxSpeed;
	private int year;
	
	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getYear() {
		return year;
	}

	
	public Car (String model, int maxSpeed, int year)
	{
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.year = year;
	}
	
	public abstract void run ();
	
	
	public abstract void stop ();
	

}
