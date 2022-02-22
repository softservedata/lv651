package com.softserve.edu.string;

import java.util.Scanner;

public class Hw2 {

	/**
	 * Enter a sentence that contains the words between more than one space.
	 * Convert all spaces, consecutive, one. 
	 * For example, if we introduce the sentence "I    am      learning     Java   Core», 
	 * we have to get the "I'm learning Java Core».
	 */

public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter a sentense with spaces: ");
     String s = scanner.nextLine();
     
	s = s.replaceAll("\\s+", " ");
	System.out.println(String.format("Sentense without duplicated spaces: \"%s\".", s));
}
}
