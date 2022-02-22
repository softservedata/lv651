package com.softserve.edu.hw06;

import java.util.Scanner;

/*Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.*/

public class InstancesCar {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", 2020, 2.8);
		Car car2 = new Car("Audi", 2021, 2);
		Car car3 = new Car("Wolksvagen", 2020, 1.4);
		Car car4 = new Car("Nissan", 2018, 1.8);
		Car temp;
		Car[] cars = { car1, car2, car3, car4 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter year of the car: ");
		int year = sc.nextInt();

		for (Car car : cars) {
			if (car.getYearProduction() == year) {
				System.out.println(car.toString());
			}
		}
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearProduction() > cars[j].getYearProduction()) {
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Cars sorted by the field year:");
		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}
}
