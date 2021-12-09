package HW05.HomeTask;

import java.util.Arrays;
import java.util.Scanner;

public class HT_2 {

    private static int[] ints = new int[10];

    public static void main(String[] args) {
        /*Enter 10 integer numbers.
            Calculate the sum of first 5 elements
                if they are positive or product of last 5 element in the other case.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("№ " + (i + 1) + ": ");
            String ans = scanner.nextLine();
            ints[i] = Integer.parseInt(ans);
        }
        System.out.println("Your numbers are:");
        System.out.println(Arrays.toString(ints));
        if (isFirstFiveDigPositive()) {
            System.out.println("All first five digits are positive.");
            System.out.println("Their sum is:" + getSum(5));
        } else {
            System.out.println("Some of first five digits are negative.");
            System.out.println("So their product is:" + getMul(10));
        }
        scanner.close();
    }

    private static boolean isFirstFiveDigPositive() {
        boolean allPos = true;
        for (int i = 0; i < 5; i++) {
            if (ints[i] < 0) {
                allPos = false;
                break;
            }
        }
        return allPos;
    }

    private static int getSum(int nums) {
        int sumD = 0;
        for (int i = 0; i < nums; i++) {
            sumD = sumD + ints[i];
        }
        return sumD;
    }

    private static int getMul(int nums) {
        int mulD=1;
        for (int i = ints.length-1; i > ints.length-nums-1; i--) {
            mulD = mulD * ints[i];
        }
        return mulD;
    }
}


