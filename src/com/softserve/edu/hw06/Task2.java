package com.softserve.edu.hw06;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		// Enter 10 integer numbers. Calculate the sum of first 5 elements
		// if they are positive or product of last 5 element in the other case.

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		int prod = 1;
		boolean FiveisPositive = true;
		System.out.println("Please, enter 10 integer numbers: ");
		for (int i = 0; i < array.length; i++) {
							System.out.print("Number " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}
			System.out.println("Array: " + Arrays.toString(array));
		
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] >= 0) {
				sum = sum + array[i];
			} else {
				for (int j = 0; j < array.length / 2; j++) {
					if (array[array.length - 1 - j] != 0) {
						prod = prod * array[array.length - 1 - j];
					}
				}
				FiveisPositive = false;
				break;
			}
		}
		if (FiveisPositive) {
			System.out.println();
			System.out.println("Sum of first 5 elements: " + sum);
		} else {
			System.out.println();
			System.out.println("Product of last 5 elements: " + prod);
		}
	}
}