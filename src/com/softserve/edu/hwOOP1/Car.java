package com.softserve.edu.hwOOP1;

public abstract class Car {

	private String model;
	private int maxSpeed;
	private int yearOfManufacture;

	public abstract void run();

	public abstract void stop();

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Car() {
	}

	public Car(String model, int maxSpeed, int yearOfManufacture) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}

