package com.softserve.edu.hw08;

public abstract class Person {
	private FullName fullNane;
	private int age;

	public FullName getFullNane() {
		return fullNane;
	}

	public void setFullNane(FullName fullNane) {
		this.fullNane = fullNane;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(FullName fullName, int age) {
		this.age = age;
		this.fullNane = fullName;
	}

	public abstract String activity();

	public abstract void info();

}
