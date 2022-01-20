package com.softserve.edu.hw08.task1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private float hourSalary;
    private float workHours;
    private float salary;

    public SalariedEmployee( String socialSecurityNumber, float hourSalary, float workHours) {
        setEmployeeld(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourSalary = hourSalary;
        this.workHours = workHours;
    }

    @Override
    public String getEmployeeld() {
        return super.getEmployeeld();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public float getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(float hourSalary) {
        this.hourSalary = hourSalary;
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + getEmployeeld() + '\'' +
                ", hourSalary=" + hourSalary +
                ", workHours=" + workHours +
                ", Salary=" + calculatePay() +
                '}';
    }

    @Override
    public float calculatePay() {
        salary = hourSalary * workHours;
        return salary;
    }
}
