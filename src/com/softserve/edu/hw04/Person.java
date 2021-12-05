package com.softserve.edu.hw04;

import java.util.Scanner;

/*Create Console Application project in Java.
Add class Person to the project.
Class Person should consist of
three private fields: firstName, lastName and birthYear (the birthday year) 
properties for access to these fields
default constructor and constructor with 2 parameters (first and last names)
methods:
getAge() - to calculate the age of person
input() - to input information about person
output() - to output information about person
changeName(String fn, String ln) - to change the first name or/and last name of person

In the method main() create 5 objects of Person type and input information about them.*/

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;

	public static Person input() {
		Scanner scan = new Scanner(System.in);
		Person p = new Person();
		System.out.print("First name: ");
		p.setFirstName(scan.next());
		System.out.print("Last name: ");
		p.setLastName(scan.next());
		System.out.print("Birth year: ");
		p.setBirthYear(scan.nextInt());
		return p;
	}

	public Person() {

	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return 2021 - birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	public String output() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}

}
