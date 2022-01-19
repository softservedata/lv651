package com.softserve.edu.hw09.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ApplMap {

	

	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new HashMap<>();
		
		employeeMap.put(1, "Garry Kasparow");
		employeeMap.put(2, "Ardrii Duda");
		employeeMap.put(3, "Leonid Kadeniuk");
		employeeMap.put(4, "Stepan Giga");
		employeeMap.put(5, "Erih Remark");
		employeeMap.put(6, "Serhiy Prytula");
		employeeMap.put(7, "Misha Lonyk");
		
		System.out.println(employeeMap);
		System.out.println("Please enter person's Id:  " );
		Scanner sc = new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		 
		if (employeeMap.containsKey(key))
		System.out.println( employeeMap.get(key));
		else
		System.out.println("Entered wrong key!");	
		 
		System.out.println("Please enter person's name:  " );	
		String value = sc.nextLine();
		sc.close();
			
		for (Entry<Integer, String> entry : employeeMap.entrySet()) {
	           
			if (entry.getValue().equals(value)) {
				System.out.println(entry.getKey());
			
			}
	        else { System.out.println("Wrong name!");
	       		break;
	       	}
		}
			
	}
}
