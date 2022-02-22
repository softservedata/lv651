package com.softserve.edu.hwOOP1;

public class Truck extends Car {
	public final String model = "Truck";
	
	
	public Truck() {
		super();
	
	}

	public Truck(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
		
	}

	@Override
	public void run() {
	System.out.println("The truck is running");
		
	}

	@Override
	public void stop() {
		System.out.println("The truck has stopped");
		
	}

}
