package com.softserve.edu.string;

import java.util.Scanner;

/**
 * Implement a pattern for US currency: the first symbol "$", then any number of
 * digits, dot and two digits after the dot. Enter the text from the console
 * that contains several occurrences of US currency. Display all occurrences on
 * the screen.
 */
public class hw3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter US currency: ");
		String dollars = scanner.nextLine();
		System.out.println("Entered amount is: " + dollars + " $.");
		String pattern = "^\\$(([1-9]\\d*)?\\d)(\\.d\\d\\)?$";
		String p = "\\$(\\d*)(\\.\\d{2})?\n";
		System.out.println(pattern.matches(dollars)); 
		System.out.println(p.matches(dollars));
		scanner.close();

	}
}
