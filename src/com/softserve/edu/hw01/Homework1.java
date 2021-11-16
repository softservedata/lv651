package com.softserve.edu.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Homework1 {
	private static final double radius = 5;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * Define integer variables a and b. Read values a and b from Console and
		 * calculate: a + b a - b a * b a / b. Output obtained results.
		 */

		int a, b;
		a = 5;
		b = 2;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println();
		/*
		 * Output question “How are you?“. Define string variable answer. Read the value
		 * answer and output: “You are (answer)"
		 */
		System.out.println("How are you?");
		String name = br.readLine();
		System.out.println("You are " + name);
		System.out.println();

		/*
		 * Flower bed is shaped like a circle. Calculate the perimeter and area by
		 * entering the radius. Output obtained results
		 */

		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.sqrt(radius);

		System.out.println("The perimeter is = " + perimeter);
		System.out.println("The area is = " + area);
		System.out.println();

		/*
		 * Define String variables name and address. Output question
		 * "What is your name?" Read the value name and output next question: “Where are
		 * you live, (name)?". Read address and write whole information
		 */

		System.out.println("What is your name?");
		String name1 = br.readLine();
		System.out.println("Where are you live, " + name1 + "?");
		String address = br.readLine();
		System.out.println("Your address is: " + address);

		/*
		 * Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units
		 * per minute. Talks continued t1, t2 and t3 minutes. How much computer will
		 * count for each call separately and all talk together? Input all source data
		 * from console, make calculations and output to the screen
		 */
		System.out.println("Please enter the following data: ");
		Scanner scan = new Scanner(System.in);
		double c1 = scan.nextDouble();
		double c2 = scan.nextDouble();
		double c3 = scan.nextDouble();
		double t1 = scan.nextDouble();
		double t2 = scan.nextDouble();
		double t3 = scan.nextDouble();

		System.out.println("The cost of a conversation with the first country: " + (c1 * t1));
		System.out.println("The cost of a conversation with the second country: " + (c2 * t2));
		System.out.println("The cost of a conversation with the thirst country: " + (c3 * t3));
		System.out.println("The cost of a conversation with all countries: " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));
	}

}
