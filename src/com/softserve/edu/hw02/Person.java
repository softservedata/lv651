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
		
		Person p1 = new Person();		input(p1);	
		Person p2 = new Person();		input(p2);	
		Person p3 = new Person();		input(p3);		
		Person p4 = new Person();		input(p4);	
		Person p5 = new Person();		input(p5);	
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
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

	private void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
		
	}


	public int getAge (int birthYear ) {
		return Calendar.getInstance().get(Calendar.YEAR)-birthYear; 
	}
	
//	@Override
//	public String toString() {
//		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
//	}
	
	public  void output( ) {
		
		  System.out.println("Person_" + id+ 		 "	[lastName = " + lastName + 
				   ", firstName = " + firstName + 
				   ", age = " +( Calendar.getInstance().get(Calendar.YEAR)-birthYear) + " years]");
	}
	
		public static Person input (Person p ) {
		System.out.println(" Input first name of Person_"+id+" : ");
		Scanner sc = new Scanner(System.in);
		String fn = sc.nextLine();
		p.setFirstName(fn);
		System.out.println(" Input last name of Person_"+id+" : ");
		String ln = sc.nextLine();
		p.setLastName(ln);
		System.out.println(" Input year of birth: ");
		int birthYear = Integer.parseInt(sc.nextLine()); 
		p.setBirthYear(birthYear);
		sc.close();
		return p;
	}
		
}	

