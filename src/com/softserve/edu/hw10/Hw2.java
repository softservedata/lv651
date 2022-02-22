package com.softserve.edu.hw10;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName). 
 * Output the entities of the map on the screen. 
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.  
 */
public class Hw2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		String[] names = { "Cristiano Ronaldo", "Lionel Messi", "Luka Modrić", "Antoine Griezmann", "Manuel Neuer",
				"Franck Ribéry", "Andrés Iniesta", "Fernando Torres", "Gianluigi Buffon", "Fabio Cannavaro" };
		for (String name : names) {
			String[] nameParts = name.split("\\s");
			personMap.put(nameParts[1], nameParts[0]);
		}
		personMap.put("Lutyi", "Orest");
		personMap.put("Subtelny", "Orest");
		System.out.println(String.format("Names: %s", personMap));

		// There are at less two persons with the same firstName among these 10 people?

		Map<String, Integer> doublicatedNames = new HashMap<String, Integer>();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			String firstName = entry.getValue();
			String lastName = entry.getKey();
			if (doublicatedNames.containsKey(firstName)) {
				doublicatedNames.replace(firstName, doublicatedNames.get(firstName) + 1);
			} else {
				doublicatedNames.put(firstName, 1);
			}
		}
		System.out.println(String.format("Duplicates count: %s", doublicatedNames));

		Map<String, Integer> douplicates = doublicatedNames.entrySet().stream().filter(x -> x.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(String.format("Only duplicates: %s", douplicates));

		// Remove from the map person whose firstName is ”Orest” (or other). Print
		// result.

		String nameToDelete = "Orest";
		Iterator iterator = personMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			if (entry.getValue().equals(nameToDelete)) {
				iterator.remove();
			}
		}
		System.out.println(String.format("Without %s: %s", nameToDelete, personMap));
	}

}