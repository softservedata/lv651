package com.softserve.edu.hw05;

import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		//Task2 
				// read 3 integer numbers and write max and min of them; 
				//The first way to solve:

				System.out.println();
				System.out.println("Please, enter first number:");

			int first = scanner.nextInt();System.out.println("Please, enter second number:");
			int second = scanner.nextInt();System.out.println("Please, enter third number:");
			int third = scanner.nextInt();
			int largest = largest(first, second, third);
			int smallest = smallest(first, second, third);
			System.out.printf("Largest of three numbers %d, %d, and %d is : %d %n",first,second,third,largest);
					System.out.printf("Smallest of three numbers %d, %d, and %d is : %d %n",first,second,third,smallest);
					scanner.close();
			}

				public static int largest(int first, int second, int third) {
				int max = first;
				if (second > max) {
					max = second;
				}
				if (third > max) {
					max = third;
				}
				return max;
			}

			
			public static int smallest(int first, int second, int third) {
				int min = first;
				if (second < min) {
					min = second;
				}
				if (third < min) {
					min = third;
				}
				return min;
			}

			//Task2 
			//The second way to solve:
			
			/*
			 * System.out.println("Please input 3 integers: "); int x = scanner.nextInt();
			 * int y = scanner.nextInt(); int z = scanner.nextInt(); int max =
			 * Math.max(Math.max(x,y),z); int min = Math.min(Math.min(x,y),z);
			 * System.out.println(x + " " + y + " "+ z);
			 * System.out.println("The max of three is: " + max);
			 * System.out.println("The min of three is: " + min);
			 */
	}


