package HW11.PracticalTask;

import java.util.Scanner;

public class PT1 {
    /*
    Create a method for calculating the area of a rectangle
        int squareRectangle (int a, int b),
    which should throw an exception if the user enters negative value.
    Input values a and b from console. Check the squareRectangle method in the method main.
    Check to input nonnumeric value.
    */
    public static void main(String[] args) {
        int a, b;
//        a = -2;
//        b = -4;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please input a:");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input b:");
            b = Integer.parseInt(scanner.nextLine());
            int square = squareRectangle(a, b);
            System.out.println("square = " + square);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Mistake!");
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("Data can't be < 0");
        }


    }

    public static int squareRectangle(int a, int b) throws ArithmeticException {
        if (a < 0 || b < 0) {
            String mes = (a < 0 ? "arg a = '" + a + "' can't be < 0" : "") +
                    (a < 0 && b < 0 ? " and " : "") +
                    (b < 0 ? "arg b = '" + b + "' can't be < 0" : "");
            throw new ArithmeticException(mes);
        }
        return a * b;
    }
}
