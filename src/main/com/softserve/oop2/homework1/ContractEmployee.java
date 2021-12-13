package com.softserve.oop2.homework1;

public class ContractEmployee extends Employee implements Payment {

    public String federalTaxIdmember;
    public String name;
    public int fixedPayment;


    public ContractEmployee(String federalTaxIdmember, String name, int fixedPayment) {
        this.federalTaxIdmember = federalTaxIdmember;
        this.name = name;
        this.fixedPayment = fixedPayment;
        this.salary = calculatePay();
        this.id = idNumber();
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public String getName() {
        return name;
    }

    public int getFixedPayment() {
        return fixedPayment;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int calculatePay() {
        return salary = fixedPayment;
    }

    @Override
    public String idNumber() {
        return id = federalTaxIdmember;
    }
}
