package com.softserve.edu.hw08;

public class Student extends Person {

	private int idCourse;

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public Student(FullName fullName, int age, int idCourse) {
		super(fullName, age);
		this.idCourse = idCourse;

	}

	@Override
	public String activity() {
		return "I study at university";
	}

	public void info() {
		System.out.println(String.format("First name:	 %s , Last name: 	%s , Age:	 %d ,idCourse: 	%s ",
				getFullNane().getFirstName(), getFullNane().getLastName(), getAge(), getIdCourse()));
	}

}
