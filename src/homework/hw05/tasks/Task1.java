package homework.hw05.tasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] monthname = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		System.out.println("Enter number of month: ");
		int a = sc.nextInt();
		System.out.println(monthname[a-1] + " has " + month[a-1] + " days");
	}
}
