package com.softserve.edu.hwOOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Appl3 {

	public static void main(String[] args) {
		
		  List <Employee> employees = new ArrayList();
	        employees.add(new SalariedEmployee("1", "Igor", "76196446", 25, 176));
	        employees.add(new ContractEmployee("2", "Ira", "76098", 5000));
	        employees.add(new SalariedEmployee("3", "Nastya", "70256747", 22, 198));
	        employees.add(new ContractEmployee("4", "Oleg", "92348", 6000));
	        for (Employee employee: employees) {
	            System.out.println(employee);
	        }
	        System.out.println("");
	        Collections.sort(employees);
	        for (Employee e: employees) {
	            System.out.println("Employee ID: " + e.getEmployeeId()
	                    + " Name: " + e.getName()
	                    + " Salary: " + e.calculatePay());
	        }
	}

}
