package com.softserve.edu.homework10;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        try {
            System.out.println("Enter first number: ");
                a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter second number: ");
                b = Integer.parseInt(scanner.nextLine());
            int squareRectangle = squareRectangle(a, b);
            System.out.println("Square = " + squareRectangle);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("Error!");
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("The number must be < 0");
        }
        scanner.close();
    }
    public static int squareRectangle (int a, int b) throws ArithmeticException {

        if (a < 0 || b < 0) {
            String message = (a < 0 ? "a = '" + a + "' must be < 0" : "") +
                    (a < 0 && b < 0 ? " and " : "") +
                    (b < 0 ? "b = '" + b + "' must be < 0" : "");
            throw new ArithmeticException(message);
        }
        return a * b;
    }
}
