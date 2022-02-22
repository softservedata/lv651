package com.softserve.edu.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Enter surname, name and patronymic on the console 
as a variable of type String. Output on the console:
surnames and initials
name
name, middle name and last name*/

public class Pract2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter surname, name and patronymic: ");
		String s = scanner.nextLine();

		Pattern p = Pattern.compile("(\\w+)\\s+(\\w+)\\s+(\\w+)");
		Matcher m = p.matcher(s);
		if (m.find()) {
			String lastName = m.group(1);
			String firstName = m.group(2);
			String middleName = m.group(3);

			System.out.println(String.format("Surnames: %s", lastName));
			System.out.println(String.format("Names: %s", firstName));
			System.out.println(String.format("Full names: %s", firstName + middleName + lastName));
		}
	}
}
