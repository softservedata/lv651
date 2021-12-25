package com.softserve.edu.homework6;

public class ContractEmployee extends Employee implements Payment {

    String socialSecurityNumber = "I'm fixed paid worker with social Security Number";

    public ContractEmployee(String employeeld, String name, String position, double fixedMonthlyPayment) {
        super(employeeld, name, position, fixedMonthlyPayment);
    }

    @Override
    public double calculatePay() {
        return salary = fixedMonthlyPayment; //salary = fixedMonthlyPayment
    }
}
