package com.softserve.edu.hw02;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
	public static int id =0; 
	private String firstName;
	private String lastName;
	private int birthYear;

	
	public static void main(String[] args) {
	
		System.out.println("Hi!");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		input(p1);	p1.output();
		input(p2);	p2.output();
		input(p3);	p3.output();
		input(p4);	p4.output();
		input(p5);	p5.output();
		
		
		

		
	}

	public Person () {
		id++;
	}
	
    public Person(String firstName , String lastName , int birthYear ) { 
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.birthYear = birthYear;
    	
    	id++;
    }
	
    public Person(String firstName , String lastName ) { 
    	this.firstName = firstName;
    	this.lastName = lastName;
    	
    	id++;
    }
    
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	private void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
		
	}


	public int getAge (int birthYear ) {
		return Calendar.getInstance().get(Calendar.YEAR)-birthYear; 
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
	
	public  void output( ) {
		
		  System.out.println("Person" + id+ 		 "	[lastName = " + lastName + 
				   ", firstName = " + firstName + 
				   ", age = " +( Calendar.getInstance().get(Calendar.YEAR)-birthYear) + " years]");
	}
	
		public static Person input (Person p ) {
		System.out.println("Hello! Input first name: ");
		Scanner sc = new Scanner(System.in);
		String fn = sc.nextLine();
		p.setFirstName(fn);
		System.out.println(" Input last name: ");
		String ln = sc.nextLine();
		p.setLastName(ln);
		System.out.println(" Input year of birth: ");
		int birthYear = Integer.parseInt(sc.nextLine()); 
		p.setBirthYear(birthYear);
		sc.close();
		return p;
	}
		
}	

