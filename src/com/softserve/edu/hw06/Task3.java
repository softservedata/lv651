package com.softserve.edu.hw06;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * Enter 5 integer numbers. Find position of second positive number; minimum and
		 * its position in the array. Organize entering integers until the first
		 * negative number. Count the product of all entered even numbers.
		 */

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];

		int i;
		

		System.out.println("Please, enter 5 integer numbers: ");
		for (i = 0; i < array.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(array));
		int min = array[0];
		int index = 0;
		for (i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("Minimum = " + min + " is in " + index + " place.");
		int count=0;
		for (i = 0; i < array.length; i++) {
			if (array[i] > 0) {
			count++;
			if (count == 2) {
				index = i;
			}
		}
		}
				System.out.println("Second positive number is in " + index + " place.");

	}
	}
