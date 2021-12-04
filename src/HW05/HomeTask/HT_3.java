package HW05.HomeTask;

import java.util.Arrays;
import java.util.Scanner;

public class HT_3 {
    private static int[] ints = new int[5];

    public static void main(String[] args) {
        /*
        Subtask №1
            Enter 5 integer numbers. Find
            position of second positive number;
            minimum and its position in the array.
        Subtask №2
            Organize entering integers until the first negative number.
            Count the product of all entered even numbers.
        */
        Scanner scanner = new Scanner(System.in);

        //Subtask №1
        System.out.println("Enter 5 integer number:");
        for (int i = 0; i < 5; i++) {
            System.out.print("№ " + (i + 1) + ": ");
            String ans = scanner.nextLine();
            ints[i] = Integer.parseInt(ans);
        }
        System.out.println("Your numbers are:");
        System.out.println(Arrays.toString(ints));

        int positiveNumberPosition = gePositiveNumberPosition(2);
        if (positiveNumberPosition == -1) {
            System.out.println("Second positive number didn't find");
        } else {
            System.out.println("Position of second positive number:" + positiveNumberPosition);
        }
        int minNumber = getMinNumber();
        System.out.println("Minimum is " + minNumber + " and its position in array is :" + (getMinNumberPosition(minNumber) + 1));
        System.out.println("Well done!!!");

        //Subtask №2
        System.out.println("Now please enter positive integer numbers. Negative for exit:");
        int product = 1;
        do {
            String nextLine = scanner.nextLine();
            int i = Integer.parseInt(nextLine);
            if (i < 0) break;
            if (i % 2 == 0) product = product * i;
        } while (true);
        System.out.println("the product of all entered even numbers :" + product);
    }

    private static int getMinNumberPosition(int minNumber) {
        int i = 0;
        while (ints[i] != minNumber && i < ints.length) {
            i++;
        }
        return i;
    }

    private static int gePositiveNumberPosition(int pos) {
        int i = 0;
        int countPosNum = 0;

        while (countPosNum < pos && i < ints.length) {
            if (ints[i] > 0) countPosNum++;
            i++;
        }

        if (pos > ints.length || countPosNum < pos) i = -1;

        return i;
    }

    //gets min for array ints
    private static int getMinNumber() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            min = ints[i] < min ? ints[i] : min;
        }
        return min;
    }
}
