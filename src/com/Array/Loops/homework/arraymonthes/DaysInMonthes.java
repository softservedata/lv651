package com.Array.Loops.homework.arraymonthes;

import java.util.Arrays;
import java.util.Scanner;

public class DaysInMonthes {
    int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    int j = 0;
//    int f;

    public void daysInThisMonth() {
        System.out.println("Hello, What is the number of this month?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Your numer of month: " + a + ".");
        if (a < 13 && a >= 0) {
            System.out.println(daysOfMonth[--a]);
//            for (int i = 0; i < daysOfMonth.length; i++) {
//                j = daysOfMonth[i];
//                f = i;
//                if (i == a) {
//                    System.out.println("You have " + daysOfMonth[i] + " days in this month.");
//                }
//            }
        } else {
            System.out.println("We don`t have any month as like " + a);
        }
        System.out.println(Arrays.toString(daysOfMonth));
    }
    public String toString() {
        return "DaysInMonthes{" +
                "daysOfMonth=" + Arrays.toString(daysOfMonth) +
//                ", j=" + j +
//                ", f=" + f +
                '}';
    }
}
