package com.softserve.edu.hw05;

import java.util.Objects;

public class Dog {

	
		/*
		 * Ñreate class Dog with fields name, breed, age. Declare enum for field breed.
		 * Create 3 instances of type Dog. Check if there is no two dogs with the same
		 * name. Display the name and the kind of the oldest dog.
		 */

		private String name;
		private String breed;
		private int age;
		
		public Dog(String name, String breed, int age) {
			this.name = name;
			this.breed = breed;
			this.age = age;
		}
		
		public enum Breed {
		TERRIER, AKITA, BULLDOG;
	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, breed, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dog other = (Dog) obj;
			return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(name, other.name);
		}
		
		
		
}



	

