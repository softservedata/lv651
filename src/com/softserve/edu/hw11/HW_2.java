package com.softserve.edu.hw11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HW_2 {
//    int start = 1;
//    int end = 100;

    public static void readNumber(int start, int end) {

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (list.size() <= 10) {

            try {

                System.out.println("Enter number between " + start + " and " + end + ':');

                int a = Integer.parseInt(sc.nextLine());
                if (a <= start || a >= end) {
                    throw new Exception("Number is out of range. ");
                }
                list.add(a);
                start = a;
            } catch (NumberFormatException | IOException e) {
                System.out.println("NumberFormatException | IOException");
//                e.printStackTrace();1
            } catch (Exception e) {
                // System.out.println("Number is out of range! ");
                e.printStackTrace();
            }


        }
        sc.close();
        System.out.println(list);
    }

    public static void main(String[] args) {
        readNumber(1, 100);

    }

}