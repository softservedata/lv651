package com.softserve.edu.hw07;

import java.util.Comparator;

public class SalariedEmployee extends Employee implements Payment {
	private int hourRate;
	private int hours;
	private int socialNumber;
	private int salary = hourRate * hours;
	
	
	public String getName() {
		return super.getName();
	}

	public int getSalary() {
		return salary;
	}


	public int getHourRate() {
		return hourRate;
	}


	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}



	public int getHours() {
		return hours; 
	}



	public void setHours(int hours) {
		this.hours = hours;
	}



	public int getSocialNumber() {
		return socialNumber;
	}



	public void setSocialNumber(int socialNumber) {
		this.socialNumber = socialNumber;
	}

	public SalariedEmployee() {
		super();
		hourRate = 0;
		hours = 0;
		socialNumber = 0;
		
		
	}

	
	public SalariedEmployee(String name, int age, int hourRate, int hours, int socialNumber) {
		super(name, age);
		this.hourRate = hourRate;
		this.hours = hours;
		this.socialNumber = socialNumber;
		salary = hours*hourRate;
		
	}
	
	

	@Override
	public String toString() {
		return "SalariedEmployee [ "+ super.getName()  + "salary=" + salary + "	hourRate=" + hourRate + " hours=" + hours + ", socialNumber=" + socialNumber
				+ " ]" ;
	}


	@Override
	public int calculatePay () {
		int salary = hours * hourRate;
		return  salary;
	}


	public class BySalary implements Comparator<SalariedEmployee>	{
	    @Override
	    public int compare(SalariedEmployee s1, SalariedEmployee s2) {
	        return ((Employee)s1).salary - ((Employee)s2).salary;
	    }
	}
	
	
	public class ByName implements Comparator<SalariedEmployee>	{
	    @Override
	    public int compare(SalariedEmployee s1, SalariedEmployee s2) {
	        return ((Employee)s1).getName().compareTo(((Employee)s1).getName());
	    }
	}
				
	}

