package com.softserve.edu.hw10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr2 {

	/*
	 * In the main() method declare map employeeMap of pairs <Integer, String>.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

		/*
		 * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
		 */
		employeeMap.put(1, "Andrew");
		employeeMap.put(2, "Alex");
		employeeMap.put(3, "Anthony");
		employeeMap.put(5, "Ann");
		employeeMap.put(8, "Alfred");
		employeeMap.put(13, "Arnold");
		employeeMap.put(21, "Alice");
		
		System.out.println(employeeMap);
		for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
			System.out.println(String.format(String.format("Employee #%d name is %s.", entry.getKey(), entry.getValue())));
		}
		
		/*
		 * Ask user to enter ID, then find and write corresponding name from your map. 
		 * If you can't find this ID - say about it to user (use function containsKey()).
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		String sourceLine = s.nextLine();
		int id = Integer.parseInt(sourceLine.trim());
		
		if (employeeMap.containsKey(id)) {
			System.out.println(String.format("Employee #%d name is %s.", id, employeeMap.get(id)));
		} else {
			System.out.println(String.format("There is no such employee with #%d.", id));
		}
		
		
		/*
		 * Ask user to enter name, verify than you have name in your map and write corresponding ID.
		 * If you can't find this name - say about it to user (use function containsValue()).
		 */
		System.out.print("Enter employee's name: ");
		sourceLine = s.nextLine();
		String name = sourceLine.trim();
		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println(String.format(String.format("Employee #%d name is %s.", entry.getKey(), entry.getValue())));
					break;
				}
			}
		} else {
			System.out.println(String.format("There is no such employee with name %s.", name));
		}
		
	}

}