package com.softserve.edu.hw07.task1;

public class ContractEmployee extends Employee implements Payment {


    String federalTaxIdMember;
    int fixedMonthlyPayment;

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;


    }

    public ContractEmployee(String federalTaxIdMember, int fixedMonthlyPayment) {
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }
}
