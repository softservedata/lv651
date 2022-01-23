package com.softserve.edu.hw10.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
		surnames and initials
		name
		name, middle name and last name	*/

public class PT2 {

	public static void surnameAndInitials(List<String> list) {
		System.out.printf("%s %s. %s. %n", formatName(list.get(0)), list.get(1).toUpperCase().charAt(0),
				list.get(2).toUpperCase().charAt(0));
	}

	public static void name(List<String> list) {
		String firstName = formatName(list.get(1));
		System.out.println(firstName);
	}

	public static void fullName(List<String> list) {

		String firstName = formatName(list.get(1));
		String middleName = formatName(list.get(2));
		String lastName = formatName(list.get(0));

		System.out.println(firstName + " " + middleName + " " + lastName);
	}

	private static String formatName(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static void main(String[] args) {

		System.out.println(" Enter surname, name and patronymic  : ");
		Scanner sc = new Scanner(System.in);
		String fullName = sc.nextLine();

		List<String> myList = new ArrayList<String>(Arrays.asList(fullName.split(" ")));

		if (myList.size() != 3)
			System.out.println(" Wrong full name ;( ");
		else {
			surnameAndInitials(myList);
			name(myList);
			fullName(myList);
		}

	}

}