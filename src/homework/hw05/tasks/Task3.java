package homework.hw05.tasks;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int position = -1, positionmin = -1, min, prod = 1, a;
		int count = 0;
		boolean isNegative = false;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			a = sc.nextInt();

			//counting the product of all entered numbers before negative number.
			if (a < 0) {
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (arr[j] > 0) {
							prod = prod * arr[j];
						}
					}
					isNegative = true;
				}
				break;
			}

			//position of second positive number
			arr[i] = a;
			if (arr[i] > 0) {
				count++;
				if (count == 2) {
					position = i;
				}
			}
		}

		//minimum and its position in the array.
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min && arr[i] > 0) {
				min = arr[i];
				positionmin = i;
			}
		}

		System.out.println("If we perceive Zero as a non-positive and non-negative number, then we get: ");
		if (position > -1) {
			System.out.println("\tposition of second positive number: " + position);
		}
		if (positionmin > -1) {
			System.out.println("\tminimum: " + min + "\n\tposition(min): " + positionmin);
		}
		if (isNegative) {
			System.out.println("Product of all entered numbers: " + prod);
		}
	}
}
