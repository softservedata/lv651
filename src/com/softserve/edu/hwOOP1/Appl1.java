package com.softserve.edu.hwOOP1;

public class Appl1 {

	/*
	 * 1. Create abstract class Car with model, maxSpeed and yearOfManufacture
	 * properties and run() and stop() methods. Develop classes Truck and Sedan
	 * which extend class Car. In main method create array of Car’s objects. Add to
	 * this array some trucks and sedans and print info about it
	 */

	public static void main(String[] args) {

		Car car1 = new Truck("WW Polo5", 270, 2018);
		Car car2 = new Truck("WW Polo6", 280, 2020);
		Car car3 = new Sedan("WW Polo4", 200, 2012);
		Car car4 = new Sedan("WW Polo7", 290, 2021);

		Car[] cars = {car1, car2, car3, car4};

		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
