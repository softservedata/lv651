package com.softserve.edu.exception;

import java.util.Scanner;

/*Create method div(), which calculates the dividing of two double numbers. In main method 
input 2 double numbers and call this method. Catch all exceptions. 
Write a method readNumber(int start, int end), that read from console integer number and
return it, if it is in the range [start...end]. 
If an invalid number or non-number text is read, the method should throw an exception. 
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.*/


public class Hw1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double a;
		double b; 
		while(true) {
			try {
				System.out.print("Enter first number: ");
				a = Double.parseDouble(sc.nextLine());
				
				System.out.print("Enter second number: ");
				b = Double.parseDouble(sc.nextLine());
				
				double res = Hw1.div(a, b);
				System.out.println (res);
				break;
			}catch (ArithmeticException e) {
				System.out.println ("Arithmetic exception");
			}catch (NumberFormatException e) {
				System.out.println("NumberFormatException");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException");
			}
			}
	}
		public static double div (double a, double b) {
			return a/b; 	
		}
		
				}
		
	
	