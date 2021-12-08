package com.softserve.edu.hw06;

public class Sedan extends Car {
	private int numberOfSeats;
	
	public Sedan(String model, int maxSpeed, int year,  int numberOfSeats) {
		super(model, maxSpeed, year);
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Sedan [numberOfSeats=" + numberOfSeats + ", Model=" + getModel() + ", MaxSpeed="
				+ getMaxSpeed() + ", Year=" + getYear() + "]";
	}

	@Override
	public void run () {
		System.out.println("Run from classSedan");	
		}
	@Override	
	public void stop () {
		System.out.println("STOP from classSedan");	
			}
	

}
