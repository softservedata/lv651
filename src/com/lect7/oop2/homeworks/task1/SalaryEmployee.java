package com.lect7.oop2.homeworks.task1;

import java.util.Random;

public class SalaryEmployee extends Employee implements Payment{
    private String name;
    protected int hourlyPayment;
    private int time;
    private int SocialSecurityNumber;
    public SalaryEmployee(int SocialSecurityNumber, String name, int time){
        this.SocialSecurityNumber = SocialSecurityNumber;
        this.name = name;
        this.time = time;
        this.salary = calculatePay();
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        SocialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public int calculatePay() {
        System.out.println("public void calculatePay() "+hourlyPayment);
        Random rand = new Random();
        hourlyPayment = rand.nextInt((11)+7)*(time)*24;
        salary = hourlyPayment;
        return salary;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "name='" + name + '\'' +
                ", hourlyPayment=" + hourlyPayment +
                ", time=" + time +
                ", SocialSecurityNumber=" + SocialSecurityNumber +
                '}';
    }
}
