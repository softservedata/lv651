package com.softserve.edu.hw06;

import java.util.Arrays;

public class PracticalOne {
	public static void main(String[] args) {
		/*
		 * Create an array of ten integers. Display  the biggest of these numbers; the
		 * sum of positive numbers in the array; the amount of negative numbers in the
		 * array. What values there are more: negative or positive?
		 */
		int[] arr = { 2, -5, 7, -4, 8, 4, 15, -15, 0, 2 };
		System.out.println("Array: " + Arrays.toString(arr));
		int max = 0;
		int min = 0;
		int sum = 0;
		int neg = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] >= 0)
				sum = sum + (arr[i]);
			if (arr[i] < 0)
				neg = neg + (arr[i]);
		}
		System.out.println("\n\nThe max of these numbers: " + max);
		System.out.println("The min of these numbers: " + min);
		System.out.println("The sum of pos numbers: " + sum);
		System.out.println("The sum of neg numbers: " + neg);
		System.out.println();

		int posCount = 0;
		int negCount = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {
				posCount++;
			}
		}
		System.out.println("The amount of pos numbers: " + posCount);
		for (int s = 0; s < arr.length; s++) {
			if (arr[s] < 0) {
				negCount++;
			}
		}
		System.out.println("The amount of neg numbers: " + negCount);
		if (negCount > posCount) {
			System.out.println("There are more negative numbers");
		} else {
			System.out.println("There are more positive numbers.");

		}
	}

}
	
	





