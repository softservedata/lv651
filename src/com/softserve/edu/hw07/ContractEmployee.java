package com.softserve.edu.hw07;

import java.util.Comparator;

public class ContractEmployee extends Employee implements Payment {
	private int salary;
	private int taxId;
	
	
	
	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public int getTaxId() {
		return taxId;
	}




	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public ContractEmployee(String name, int age ,int salary, int taxId) {
		super(name, age);
		this.salary = salary;
		this.taxId = taxId;
	}

	
	
	@Override
	public String toString() {
		return "ContractEmployee [ " + super.getName() +  "salary=" + salary + "	 taxId=" + taxId +  " ]";
	}




	@Override
	public int calculatePay( ) {

		return salary;
	}


	public class BySalary implements Comparator<ContractEmployee>	{
	    @Override
	    public int compare(ContractEmployee c1, ContractEmployee c2) {
	        return ((Employee)c1).salary - ((Employee)c1).salary;
	    }
	    
	}

	public class ByName implements Comparator<ContractEmployee>	{
	    @Override
	    public int compare(ContractEmployee c1, ContractEmployee c2) {
	        return ((Employee)c1).getName().compareTo(((Employee)c2).getName());
	    }
	}
		

		




}
