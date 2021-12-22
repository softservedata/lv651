package com.softserve.hw10;

public class Car {
	private String model; // = null
	private String color;
	private String engine;
	private String gear;
	private String light;

	/*-
	public Car(String model, String color, String engine, String gear, String light) {
		this.model = model;
		this.color = color;
		this.engine = engine;
		this.gear = gear;
		this.light = light;
	}
	*/

	public Car() {
		model = "";
		color = "";
		engine = "";
		gear = "";
		light = "";
	}
	
	public String getModel() {
		return model;
	}

	public Car setModel(String model) {
		this.model = model;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Car setColor(String color) {
		this.color = color;
		return this;
	}

	public String getEngine() {
		return engine;
	}

	public Car setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	public String getGear() {
		return gear;
	}

	public Car setGear(String gear) {
		this.gear = gear;
		return this;
	}

	public String getLight() {
		return light;
	}

	public Car setLight(String light) {
		this.light = light;
		return this;
	}

	@Override
	public String toString() {
		return "Car [model=" + model 
				+ ", color=" + color 
				+ ", engine=" + engine 
				+ ", gear=" + gear 
				+ ", light=" + light
				+ "]";
	}

}
