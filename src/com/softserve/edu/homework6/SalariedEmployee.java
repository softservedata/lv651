package com.softserve.edu.homework6;

public class SalariedEmployee extends Employee implements Payment{

    String federalTaxIdmember = "I'm hourly paid worker with federal Tax Id member";

    public SalariedEmployee(String employeeld, String name, String position, double hourlyRate, double numberOfHoursWorked) {
        super(employeeld, name, position, hourlyRate, numberOfHoursWorked);
    }

    @Override
    public double calculatePay() {
        return salary = hourlyRate * numberOfHoursWorked; //salary = hourlyRate * number of hours worked
    }
}
