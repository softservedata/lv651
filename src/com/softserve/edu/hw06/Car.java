package com.softserve.edu.hw06;

public class Car {

	/*
	 * Create class Car with fields type, year of production and engine capacity.
	 * Create and initialize four instances of class Car. Display cars certain model
	 * year (enter year in the console); ordered by the field year.
	 */

	public String type;
	private int yearProduction;
	private double engineCapacity;

	public Car(String type, int yearProduction, double engineCapacity) {
		this.type = type;
		this.yearProduction = yearProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearProduction=" + yearProduction + ", engineCapacity=" + engineCapacity + "]";
	}
	    
	    
	    
	    
}

