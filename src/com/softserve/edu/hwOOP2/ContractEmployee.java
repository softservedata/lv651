package com.softserve.edu.hwOOP2;

public class ContractEmployee extends Employee implements Payment {

	private String federalTaxIdmember;
	private int fixedMonthlyPayment;
	
	


	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}





	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}





	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}





	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}





	public ContractEmployee(String employeeId, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}





	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", fixedMonthlyPayment="
				+ fixedMonthlyPayment + "]"+ super.toString();
	}





	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
		
		
	}

}
