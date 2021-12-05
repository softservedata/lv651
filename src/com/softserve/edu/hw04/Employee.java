package com.softserve.edu.hw04;

/*Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	three private fields: name, rate and hours; 
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them. 
Display the total salary of all workers to screen*/

public class Employee {

	private String name;
	private double rate;
	private double hours;
	public static double totalSum;

	public Employee() {
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public double getSalary() {
		return rate * hours;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public double getBonuses() {
		return rate * 0.1;
	}

	public String getName() {
		return name;
	}

	public double getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

		public void changeRate(double d) {

	}

}
