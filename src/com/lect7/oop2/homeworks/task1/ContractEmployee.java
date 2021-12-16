package com.lect7.oop2.homeworks.task1;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private int fixedPayment = 2400;
    private int federalTaxIdmember;

    public ContractEmployee(int federalTaxIdmember, String name) {
        this.federalTaxIdmember = federalTaxIdmember;
        this.name = name;
        this.salary = calculatePay();
    }

    public int getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(int fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        System.out.println("public int calculatePay() " + fixedPayment);
        salary = fixedPayment;
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "fixedPayment=" + fixedPayment +
                ", federalTaxIdmember=" + federalTaxIdmember +
                '}';
    }
}
