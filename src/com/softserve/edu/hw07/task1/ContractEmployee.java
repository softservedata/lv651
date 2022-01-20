package com.softserve.edu.hw07.task1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdmember;
    private float monthSalary;
    private float salary;

    public ContractEmployee( String federalTaxIdmember, float monthSalary) {
        setEmployeeld(federalTaxIdmember);
        this.federalTaxIdmember = federalTaxIdmember;
        this.monthSalary = monthSalary;
    }

    @Override
    public String getEmployeeld() {
        return super.getEmployeeld();
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public float getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(float monthSalary) {
        this.monthSalary = monthSalary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", monthSalary=" + monthSalary +
                ", salary=" + calculatePay() +
                '}';
    }

    @Override
    public float calculatePay() {
        salary = monthSalary;
        return salary;
    }
}
