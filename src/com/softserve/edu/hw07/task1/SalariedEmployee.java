package com.softserve.edu.hw07.task1;

public class SalariedEmployee extends Employee implements Payment{

    String socialSecurityNumber;
    int hourly_Rate = 200;
    int hourWorked;


    @Override
    public int calculatePay() {
        return hourly_Rate * hourWorked;

    }

    public SalariedEmployee(String socialSecurityNumber, int hourly_Rate, int hourWorked) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourly_Rate = hourly_Rate;
        this.hourWorked = hourWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourly_Rate=" + hourly_Rate +
                ", hourWorked=" + hourWorked +
                '}';
    }
}
