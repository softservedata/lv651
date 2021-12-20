package com.company.edu.hw7;

public class SalariedEmployee extends Employee implements Payment{
  private String socialSecurityNumber;
private float workHours;
private float salary;
private float hourSalary;

    public SalariedEmployee(String socialSecurityNumber, float workHours, float hourSalary) {
        setEmployeeId(socialSecurityNumber);
        this.workHours = workHours;
        this.hourSalary = hourSalary;
    }

    public float getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(float hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public String getEmployeeId() {
        return super.getEmployeeId();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "EmployeeID=" + getEmployeeId() +
                ", workHours=" + workHours +
                ", salary=" + calculatePay() +
                ", hourSalary=" + hourSalary +
                '}';
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public float calculatePay() {
        salary=workHours*hourSalary;
        return salary;
    }



}
