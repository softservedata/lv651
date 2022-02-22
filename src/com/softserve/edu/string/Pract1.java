package com.softserve.edu.string;

import java.util.Scanner;

/*Enter the two variables of type String. Determine whether the first variable 
substring second. For example, if you typed «IT» and «IT Academy» you must receive true.*/

public class Pract1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter string 1: ");
	     String s = scanner.nextLine();
	     
	     System.out.print("Enter string 2: ");
	     String s1 = scanner.nextLine();
	     if (s1.contains(s)) {
				System.out.println(String.format("\"%s\" is a part of \"%s\".", s, s1));
			}
	}
}
