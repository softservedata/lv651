package com.softserve.edu.hw09.personMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ApplMain {

	public static void main(String[] args) {
		
		Map<String, String>	 personMap = new HashMap<>();
		personMap.put("Ardrii", 	"Duda");
		personMap.put("Leonid", 	"Kadeniuk");
		personMap.put("Stepan", 	"Giga");
		personMap.put("Erih", 		"Remark");
		personMap.put("Serhiy", 	"Prytula");
		personMap.put("Misha", 		"Lonyk");
		personMap.put("Taras", 		"Bulba");
		personMap.put("Oleg", 		"Lyashko");
		personMap.put("Misha", 		"Duda");
		personMap.put("Garry", 		"Kasparow");
		personMap.put("Napoleon",	"Bonapart");
	
		System.out.println(personMap);
		
		Iterator<Entry<String, String>> iter = personMap.entrySet().iterator();
		    HashSet<String> valueSet = new HashSet<String>();
		    while (iter.hasNext()) {
		    	Entry<String, String> next = iter.next();
		        if (!valueSet.add(next.getValue())) { 
		        System.out.println("Dublicate value is " + next.getValue());
		        }
		        if (next.getValue()=="Bonapart") { 
			        iter.remove();
			    System.out.println(personMap);
		    	}   
		        
			        
		    }  
	}
		
}
