package com.softserve.hw10;

public class AppCar {

	public static void main(String[] args) {
		// 1. Use Classic Constructor
		//Car car = new Car("Mercedes", "Black", "Petrol", "Automat", "Xenon");
		//System.out.println("Result = " + car);
		//
		// 2. Use Defaul COnstructor and setters
//		Car car = new Car();
//		car.setModel("BMW");
//		car.setColor("White");
//		car.setEngine("Disel");
//		car.setGear("Manual");
//		car.setLight("Halogen");
//		System.out.println("Result = " + car);
		//
		// 3. Add Fluent Interface
		Car car = new Car()
				.setModel("Honda")
				.setColor("Gray")
				.setEngine("V6")
				.setGear("Variator")
				.setLight("led");
		System.out.println("Result = " + car);
		System.out.println("Model = " + car.setModel(""));
		System.out.println("Result = " + car);
	}
}
