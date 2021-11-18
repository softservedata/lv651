package com.softserve.edu.hw04;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Antony", 1, 14.6);
		Employee employee2 = new Employee("Nikol", 1.5, 12.5);
		Employee employee3 = new Employee("Robert", 1.7, 22.0);
		System.out.println(employee1.getName() + " has salary: " + employee1.getSalary() + "$, bonuses: "
				+ employee1.getBonuses() + ", rate: " + employee1.getRate());
		System.out.println(employee2.getName() + " has salary: " + employee2.getSalary() + "$, bonuses: "
				+ employee2.getBonuses() + ", rate: " + employee2.getRate());
		System.out.println(employee3.getName() + " has salary: " + employee3.getSalary() + "$, bonuses: "
				+ employee3.getBonuses() + ", rate: " + employee3.getRate());
		System.out.println();
		System.out.println("The total salary of all is: "
				+ (employee1.getSalary() + employee2.getSalary() + employee3.getSalary() + "$"));

	}
}