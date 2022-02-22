package com.softserve.edu.hw06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter the number of month.
		 * Read the value and write the amount of days in this month (create array with
		 * amount days of each month).
		 */
		Scanner scanner = new Scanner(System.in);
		String[] monthname = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
	    System.out.println("Please, enter the number of month: ");
	    int x = scanner.nextInt();
	  
        System.out.println("There are "  + month[x-1] + " days in " + monthname[x-1]);
    }
}
	    
