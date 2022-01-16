package com.softserve.edu.hw04;

import java.util.Objects;

public class Dog {
	public static int id = 0;
	private String name;
	private int age;
	public enum Breed {
		DACHSHUND, CHIHUAHUA, HUSKIE
	}
	Breed breed; 
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Breed getBreed() {
		return breed;
	}

	public Dog (String name, int age, Breed breed ) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		id++;
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
		return  Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Dog #"+ "[name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}
	
//	public Dog equalsAge ( Dog d  ) {
//	
//		Dog dog;
//		if ( d instanceof Dog)
//				dog = (Dog) obj; 
//		
//		if (age>dog.age)
//		
//		return d  ;
//		}
}

