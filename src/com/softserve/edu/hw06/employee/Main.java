package com.softserve.edu.hw06.employee;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Garik", 27, 1600);
		Employee d1 = new Developer("Oskar", 33, "Middle java developer", 2400);
		
		System.out.println(d1.getClass());

		d1.report();
		e1.report();
		//e1.super.report();
		
	}

}
