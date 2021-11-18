package com.softserve.edu.hw04;

public class Main2 {

	public static void main(String[] args) {
	     Person[] people = new Person[5];
	        for (int i = 0; i < 5; i++) {
	            people[i] = Person.input();
	        }
	 
	        for (Person person : people) {
	            System.out.println(person.output());
	        }
	 
	    }
}
