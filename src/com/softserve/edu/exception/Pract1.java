package com.softserve.edu.exception;

import java.util.Scanner;

public class Pract1 {
	/*
	 * Create a method for calculating the area of a rectangle int squareRectangle
	 * (int a, int b), which should throw an exception if the user enters negative
	 * value. Input values a and b from console. Check the squareRectangle method in
	 * the method main. Check to input nonnumeric value.
	 */
	
	private static int squareRectangle(int a, int b) throws NegativeArguments {
		if ((a < 0) || (b < 0)) {
			throw new NegativeArguments("Only positive values are allowed.");
		} else {
			return a * b;
		}
	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		while (true) {
			try {
				System.out.print("Enter rectangle width: ");
				a = Integer.parseInt(s.nextLine());
				System.out.print("Enter rectangle length: ");
				b = Integer.parseInt(s.nextLine());
				int area = Pract1.squareRectangle(a, b);
				System.out.println(String.format("Rectangle area is %d", area));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error entering rectangle size: " + e.getMessage());
			} catch (NegativeArguments e) {
				System.out.println(e.getMessage());				
			}
		}
		s.close();
	}

}

class NegativeArguments extends Exception {

	public NegativeArguments() {
		super();
	}
	public NegativeArguments(String string) {
		super(string);
	}

}
