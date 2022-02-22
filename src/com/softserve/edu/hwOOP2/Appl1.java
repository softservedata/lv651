package com.softserve.edu.hwOOP2;


public class Appl1 {

	public static void main(String[] args) {
		
		Animal animal1 = new Cat( "Murchyk1");
		Animal animal2 = new Cat("Murchyk2");
		Animal animal3 = new Dog("Brovchyk1");
		Animal animal4 = new Dog("Brovchyk1");

		Animal[] animals = {animal1, animal2, animal3, animal4};

		for (Animal animal : animals) {
			animal.voice();
			animal.feed();	
		     System.out.println();
		
		}
	}
}
