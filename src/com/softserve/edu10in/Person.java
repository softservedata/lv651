package com.softserve.edu10in;

import java.util.Random;

public class Person {

	// private class FullName {
	public class FullName {
		private String firstName; // = null;
		private String lastName;

		public FullName() {
			this.firstName = "";
			this.lastName = "";
		}

		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			// age =123;
			// System.out.println("FullName age = " + age);
			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
		}
		
		public void setAge(int newAge) {
			age = newAge;
		}

	}

	// --------------------

	private FullName fullName;
	private int age; // = 0;

	public Person() {
		fullName = new FullName();
		age = 456;
	}

	public Person(String firsName, String lastName, int age) {
		this();
		fullName.firstName = firsName;
		fullName.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}

	public void run() {
		// final int bound = 100;
		int bound = 100;
		//
		class AgeGenerator {
			private String test = "_empty_";

			void setRandomAge() {
				Random random = new Random();
				// age = random.nextInt(100);
				age = random.nextInt(bound); // Read only bound;
				//  bound = 20; // Compile Error;
			}

			void printRandomNumber() {
				System.out.println("Random Age: " + age + " " + test);
			}
		}
		//
		//int bound = 100;
		//
		AgeGenerator ag = new AgeGenerator();
		ag.test = "_Updated_";
		ag.setRandomAge();
		ag.printRandomNumber();
	}
}
