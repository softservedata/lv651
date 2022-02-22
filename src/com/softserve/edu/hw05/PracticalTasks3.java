package com.softserve.edu.hw05;

import java.util.Scanner;

public class PracticalTasks3 {

	public static void main(String[] args) {
//		Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)

		System.out.println("Enter name of country: ");
		Scanner scs = new Scanner(System.in);
		String country = scs.nextLine();
		switch (country.toUpperCase()) {
		case "UKRAINE":
		case "POLAND":
		case "GERMANY":
		case "ENGLAND":
			System.out.println("The " + country + " is on " + PracticalTasks3enum.EUROPE);
			break;

		case "EGYPT":
		case "KENYA":
		case "CAMEROON":
		case "ZIMBABWE":
			System.out.println("The " + country + " is on " + PracticalTasks3enum.AFRICA);
			break;

		case "AMERICA":
		case "USA":
		case "CANADA":
		case "MEXICO":
		case "CUBA":
			System.out.println("The " + country + " is on " + PracticalTasks3enum.NORTH_AMERICA);
			break;

		case "BRAZIL":
		case "ARGENTINA":
		case "PERU":
		case "CHILE":
			System.out.println("The " + country + " is on " + PracticalTasks3enum.SOUTH_AMERICA);
			break;

		case "AUSTRALIA":
			System.out.println("The " + country + " is on " + PracticalTasks3enum.AUSTRALIA);
			break;

		case "ANTARCTICA":
			System.out.println(PracticalTasks3enum.ANTARCTICA + " no one lives there" );
			break;

		default:
			System.out.println("Invalid name");
		}
	}

}
