package com.software.edu.hw08.homework1;

public class SalariedEmployee extends Employee implements Payment{
    public String socialSecurityNumber;
    public String name;
    public int hourRate;
    public int hourWorked;

    public SalariedEmployee(String socialSecurityNumber, String name, int hourRate, int hourWorked) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.hourRate = hourRate;
        this.hourWorked = hourWorked;
        this.salary = calculatePay();
        this.id = numberId();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public int getHourRate() {
        return hourRate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int calculatePay() {
        return salary = hourRate * hourWorked;
    }

    @Override
    public String numberId() {
        return id = socialSecurityNumber;
    }
}
