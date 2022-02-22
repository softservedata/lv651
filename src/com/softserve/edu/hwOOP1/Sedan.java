package com.softserve.edu.hwOOP1;

public class Sedan extends Car {

	public final String model = "Sedan";
	
	
	
	public Sedan() {
		super();
		
	}

	public Sedan(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
		
	}

	@Override
	public void run() {
		System.out.println("The sedan is running");	
	}

	@Override
	public void stop() {
		System.out.println("The sedan has stopped");
	}

}
