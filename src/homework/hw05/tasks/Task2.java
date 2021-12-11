package homework.hw05.tasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0, prod = 1;
		boolean check = true;
		
		System.out.println("Enter 10 integer numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i] >= 0) {
				sum = sum + arr[i];
			}
			else {
				for (int j = 0; j < arr.length/2; j++) {
					if (arr[arr.length - 1 - j] != 0) {
						prod = prod * arr[arr.length - 1 - j];
					}
				}
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("Sum of first 5 elements: " + sum);
		} else {
			System.out.println("Product of last 5 elements: " + prod);
		}
	}
}
