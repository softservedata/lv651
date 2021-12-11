package homework.lesson6.tasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0, prod = 1, check = 0;
		
		System.out.println("Enter 10 integer numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= 0) {
				check++;
			} else {
				check--;
			}
		}
		
		for (int i = 0; i < arr.length/2; i++) {
			if (check >= 0) {
				sum = sum + arr[i];
			} else {
				prod = prod * arr[arr.length - i - 1];
			}
		}
		if (check >= 0) {
			System.out.println("Sum of first 5 elements: " + sum);
		} else {
			System.out.println("Product of last 5 elements: " + prod);
		}
	}
}
