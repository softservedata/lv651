package com.softserve.edu.hw07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Appl {

	public static void main(String[] args) {

		List <Employee> EmpList = new ArrayList<Employee>(); //   ??
		EmpList.add(new SalariedEmployee("Garry Kasparow	",	 32 , 20, 160, 100001));
		EmpList.add(new SalariedEmployee("Peppa Pigggi		",	 23 , 18, 120, 100002));
		EmpList.add(new SalariedEmployee("Isaak Newton		",	 19 , 27, 100, 100003));
		
		EmpList.add(new ContractEmployee("John Padra		", 	 25, 1600, 900001));
		EmpList.add(new ContractEmployee("Clark Kent		",   25, 1600, 900002));
		EmpList.add(new ContractEmployee("Mark Twen		", 		 47, 2900, 900003));
		
		for (Employee employee: EmpList)
	     {
	         System.out.println(employee);
	     }
	//	Collections.sort(EmpList, new SalariedEmployee () );
		
		System.out.println("------------------------------");
		
		
		for (Employee employee: EmpList)
	     {
	         System.out.println(employee);
	         
	         
	     }
		
	}

	
	 
}
