package com.softserve.edu.hw05;

import java.util.Scanner;

public class PracticalTasks2 {

	public static void main(String[] args) {

		// Enter the number of the day of the week. Display the name in three languages.

		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int day = in.nextInt();

		System.out.println(getDayName(day));
	}

	// Get the name for the Week
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday Понеділок Montag";
			break;
		case 2:
			dayName = "Tuesday Вівторок Dienstag";
			break;
		case 3:
			dayName = "Wednesday Середа Mittwoch";
			break;
		case 4:
			dayName = "Thursday Четвер Donnerstag";
			break;
		case 5:
			dayName = "Friday П'ятниця Freitag";
			break;
		case 6:
			dayName = "Saturday Субота Samstag";
			break;
		case 7:
			dayName = "Sunday Неділя Sonntag";
			break;
		default:
			dayName = "Invalid day range";
		}

		return dayName;
	}
}
