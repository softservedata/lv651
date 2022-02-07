package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Task1 {

    public static double div() {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = sc.nextDouble();
            return num1 / num2;

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }

    public static int readNumber(int start, int end) {

        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x <= start || x >= end)
                throw new NumberFormatException("The number does not belong to the segment :( ");
            return x;

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {

        double num = div();
        System.out.println(num);

        List<Integer> intList = new ArrayList<>();
        System.out.print("Enter 1 number: ");
        intList.add(readNumber(1, 100));
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter " + (i+2) + " number: ");
            intList.add(readNumber(intList.get(i), 100));
        }
        System.out.print("1 < ");
        intList.forEach(i -> System.out.print(i + " < "));
        System.out.print("100");
    }
}
