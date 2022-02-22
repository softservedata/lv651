package com.softserve.edu.hwOOP2;

public class Student extends Person {

	private String TYPE_PERSON = "student";
	
	
	public Student() {
		super();
	}







	@Override
	public String toString() {
		return "Student [TYPE_PERSON=" + TYPE_PERSON + "]";
	}







	public Student(String tYPE_PERSON) {
		super();
		TYPE_PERSON = tYPE_PERSON;
	}







	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
		
		
		
		
		
	}

}
