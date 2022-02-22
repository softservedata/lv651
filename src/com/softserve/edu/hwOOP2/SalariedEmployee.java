package com.softserve.edu.hwOOP2;

public class SalariedEmployee extends Employee implements Payment{

	private String socialSecurityNumber;
	private int hourlyRate;
	private int numberOfHoursWorked;
	
	


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}




	public int getHourlyRate() {
		return hourlyRate;
	}




	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}




	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}




	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}




	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}




	public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}





	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", hourlyRate=" + hourlyRate
				+ ", numberOfHoursWorked=" + numberOfHoursWorked + "]"+ super.toString();
	}




	@Override
	public int calculatePay() {
		int salary = hourlyRate * numberOfHoursWorked;
		return salary;
		
	}

}
