package com.softserve.edu.hw06.employee;

public class Developer extends Employee {
	private String position ;

	public String getPosition() {
		return position;
	}


	public Developer(String name, int age, String position,  double salary) {
		super(name, age, salary);
		this.position = position;
	}
	
	Developer d;
	@Override
	public  void report () {
		
		System.out.println( String.format("Name: %s, Age: %d,	Salary: $%.2f. Position: %s", getName(), getAge(), getSalary() , getPosition()));
	 }
}
