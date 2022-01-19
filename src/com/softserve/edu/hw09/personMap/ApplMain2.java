package com.softserve.edu.hw09.personMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ApplMain2 {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<>();
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
	

		
	
		  HashMap<String, String> personMap2 = new HashMap<>();

	        List<String> valueSet = (List<String>) personMap.values();
	        
	        Iterator<String> iterator = valueSet.iterator();
	        //while(iterator.hasNext()) {
	        	
	        	
//	            Entry<String, String> entry = iterator.next();
//	            String key = entry.getKey();
//	            String value = entry.getValue();
//
//	            if(personMap2.containsKey(value)) {
//	            	personMap2.put(value, personMap2.get(value)+", "+key);
//	            } else {
//	            	personMap2.put(value, key);
//	            }
//	        }
	        System.out.println(valueSet);

	    
		
		
	}
}
	


