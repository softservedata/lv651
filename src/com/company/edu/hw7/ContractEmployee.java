package com.company.edu.hw7;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdMember;
    private float fixedPayment;
    private float salary;


    public void setFixedPayment(float fixedPayment) {
        this.fixedPayment = fixedPayment;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public ContractEmployee( String federalTaxIdMember,float fixedPayment) {
        setEmployeeId(federalTaxIdMember);
        this.fixedPayment = fixedPayment;
    }

    @Override
    public String getEmployeeId() {
        return super.getEmployeeId();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember=" + getEmployeeId() +
                ", fixedPayment=" + fixedPayment +
                ", salary=" + calculatePay() +
                '}';
    }

    @Override
    public float calculatePay() {
        salary=fixedPayment;
return salary;
    }

}
