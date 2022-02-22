package com.softserve.edu.hw06;

import java.util.Scanner;

public class Employee {

	/*
	 * Create a class Employee with fields name, department number, salary. Create
	 * five objects of class Employee. Display all employees of a certain department
	 * (enter department number in the console); arrange workers by the field salary
	 * in descending order.
	 */
	private String name;
	private int department_number;
	private double salary;

	public Employee(String name, int department_number, double salary) {
		this.name = name;
		this.department_number = department_number;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public int getDepartment_number() {
		return department_number;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}

	public void setSalary(double salary) {
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department_number=" + department_number + ", salary=" + salary + "]";
	}

}
