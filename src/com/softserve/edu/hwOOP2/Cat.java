package com.softserve.edu.hwOOP2;

public class Cat implements Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat() {
		super();
	}

	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	@Override
	public void voice() {
		System.out.println("Cat " + name + " say mrrrrr");
	}

	@Override
	public void feed() {
		System.out.println("Cat " + name + " say omnomnom");
	}

}
