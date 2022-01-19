package com.softserve.edu.hw08;

public class Appl {

	public static void main(String[] args) {

		Person s1 = new Student(new FullName("Garry", "Kasparow"), 32, 3);
		Person s2 = new Student(new FullName("Oleksa", "Dovbush"), 7, 1);

		System.out.println(s1.activity());
		s1.info();

		System.out.println(s2.activity());
		s2.info();
		

	}

	
	
	
}
