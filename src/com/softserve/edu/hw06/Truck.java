package com.softserve.edu.hw06;

public class Truck extends Car {

	private int maxWeihgt;
	
	public Truck (String model, int maxSpeed, int year, int maxWeihgt ) {
		super(model,maxSpeed, year);
		this.maxWeihgt = maxWeihgt;
	}
	
	@Override
	public String toString() {
		return getClass().getName() +	" [maxWeihgt=" + maxWeihgt + ", Model=" + getModel() + ", MaxSpeed=" + getMaxSpeed()
				+ ", Year=" + getYear() + "]";
	}

	@Override
	public void run () {
		System.out.println("Run from classTruck");	
		}
	@Override	
	public void stop () {
		System.out.println("STOP from classSedan");	
			}
	

}
