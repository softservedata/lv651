package com.company.edu.HW11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW11 {
    public static double div() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first double:");
            double a = sc.nextDouble();
            System.out.println("Enter second double:");
            double b = sc.nextDouble();
            return a / b;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException " + e.getMessage());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException " + e.getMessage());
            return 0;

        } catch(InputMismatchException e) {
            System.out.println("InputMismatchException " + e.getMessage());
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a <= start || a >= end)
                throw new Exception("Number does not fit");
            return a;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException " + e.getMessage());
            return 0;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException " + e.getMessage());
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
