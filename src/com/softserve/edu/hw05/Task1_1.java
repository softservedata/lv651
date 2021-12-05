package com.softserve.edu.hw05;

import java.util.Scanner;

//Task1 
//read 3 float numbers and check: are they all belong to the range [-5,5];

public class Task1_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter first number:");
		float n1 = scanner.nextFloat();
		System.out.println("Please, enter second number:");
		float n2 = scanner.nextFloat();
		System.out.println("Please, enter third number:");
		float n3 = scanner.nextFloat();
		if (-5 <= n1 && n1 <= 5) {
			System.out.println("Number n1 belongs to the range [-5;5]");
		} else
			System.out.println("Number n1 is out of the range [-5;5]");
		if (-5 <= n2 && n2 <= 5) {
			System.out.println("Number n2 belongs to the range [-5;5]");
		} else
			System.out.println("Number n2 is out of the range [-5;5]");
		if (-5 <= n3 && n3 <= 5) {
			System.out.println("Number n3 belongs to the range [-5;5]");
		} else
			System.out.println("Number n3 is out of the range [-5;5]");

		if (-5 <= n1 && n1 <= 5 && -5 <= n2 && n2 <= 5 && -5 <= n3 && n3 <= 5) {
			System.out.println("All 3 float numbers belong to the range [-5;5]");
		} else
			System.out.println("Some of 3 float numbers are out of the range [-5;5]");

	}
}
