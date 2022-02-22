package com.softserve.edu.hwOOP2;

public class Dog implements Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	@Override
	public void voice() {
		System.out.println("Dog " + name + " say gavvv");
	}

	@Override
	public void feed() {
		System.out.println("Cat " + name + " say omnomnom grr");
	}
}
