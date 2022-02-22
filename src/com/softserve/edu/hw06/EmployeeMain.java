package com.softserve.edu.hw06;

import java.util.Scanner;

/*
 * Create a class Employee with fields name, department number, salary. Create
 * five objects of class Employee. Display all employees of a certain department
 * (enter department number in the console); arrange workers by the field salary
 * in descending order.
 */

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Khrystyna", 1, 5000);
		Employee employee2 = new Employee("Olena", 2, 10000);
		Employee employee3 = new Employee("Vasyl", 1, 8000);
		Employee employee4 = new Employee("Maria", 2, 7000);
		Employee employee5 = new Employee("Olya", 1, 11000);
		Employee[] employee_all = new Employee[] { employee1, employee2, employee3, employee4, employee5 };

		System.out.println("Please, enter department number in the console: ");
		Scanner sc = new Scanner(System.in);
		int department_number = sc.nextInt();

		for (int i = 0; i < employee_all.length; i++) {
			if (department_number == employee_all[i].getDepartment_number()) {
				System.out.println("This is the person " + employee_all[i].getName() + " with department number: "
						+ department_number);
			}
		}

		Employee[] employee_salary = new Employee[] { employee1, employee2, employee3, employee4, employee5 };
		Employee temp;

		for (int s = 0; s < employee_salary.length; s++) {
			for (int j = s + 1; j < employee_salary.length; j++) {
				if (employee_salary[s].getSalary() < employee_salary[j].getSalary()) {
					temp = employee_salary[s];
					employee_salary[s] = employee_salary[j];
					employee_salary[j] = temp;
				}
			}
		}
		System.out.println("Sorted workers by the field salary in descending order: ");
		for (int i = 0; i < employee_salary.length; i++) {
			System.out.println(employee_salary[i].getSalary());
		}
	  }
}