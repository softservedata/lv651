package com.softserve.edu.hwOOP2;

public class Teacher extends Staff {
	private String TYPE_PERSON = "teacher";

	
	
	public Teacher(String tYPE_PERSON) {
		super();
		TYPE_PERSON = tYPE_PERSON;
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}

	@Override
	public void salary() {
		System.out.println("I have bad salary");
	}

}
