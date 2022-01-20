package homework.hw11.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Appl {

    /* #1
     Create method div(), which calculates the dividing of two double numbers. In main method
     input 2 double numbers and call this method. Catch all exceptions.
    */

    public static double div() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter num2: ");
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

    /* #2
    Write a method readNumber(int start, int end), that read from console integer number and
    return it, if it is in the range [start...end].

    If an invalid number or non-number text is read, the method should throw an exception.

    Using this method write a method main(), that has to enter 10 numbers:
	    a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
    */

    public static int readNumber(int start, int end) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a <= start || a >= end) throw new NumberFormatException("Number out of border");
            return a;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            return 0;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {

        // #1
        double num = div();
        System.out.println("div() = " + num);

        // #2
        List<Integer> intList = new ArrayList<>();
        System.out.print("\nEnter 1 number: ");
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
