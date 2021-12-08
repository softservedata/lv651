package com.Array.Loops.homework.TenIntegers;

import java.util.Arrays;
import java.util.Random;

public class Calculating {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();
        int[] tenNumbers = new int[10];
        for (int i = 0; i < tenNumbers.length; i++) {
//          int mathRandomNumber = (int) ((Math.random() * 10));
            int oneToTen = random.nextInt(20) - 6;
            tenNumbers[i] = oneToTen;  // mathRandomNumber;
        }
        System.out.println(Arrays.toString(tenNumbers));
        boolean isNegativeDetected = false;
        for (int i = 0; i < tenNumbers.length / 2; i++) {
            if (tenNumbers[i] < 0) {
                isNegativeDetected = true;
                break;
            }
//            sum = sum + tenNumbers[i];
//            System.out.println(sum);
        }
        if (!isNegativeDetected) {
            int summa = 0;
            for (int i = 0; i < tenNumbers.length / 2; i++) {
                summa += tenNumbers[i];
            }
            System.out.println(summa);
        } else {
            for (int i = tenNumbers.length/2; i < tenNumbers.length; i++) {
                System.out.println(tenNumbers[i]);
            }
        }
//        System.out.println("All the sum = "+sum);
//        if (sum >= 0) {
//            System.out.println(sum);
//        } else {
//            for (int i = tenNumbers.length / 2; i < tenNumbers.length; i++) {
//                System.out.println(String.format("%d)", tenNumbers[i]));
//            }
//        }
    }
}
