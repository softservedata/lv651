package com.softserve.edu.hw4;
import java.util.Scanner;

public class Numbers5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int min = 0, posmin = 0, pos = 0, count = 0;

        System.out.println("Enter 5 integer numbers: ");
        for (int n = 0; n < arr.length; n++) {
            arr[n] = sc.nextInt();
            if (arr[n] < min){
                min = arr[n];
                posmin = n;
            }
            if (arr[n] >= 0) {
                count++;
                if (count == 2) {
                    pos = n;
                }
            }
        }
        System.out.println("Min value is: " + min + ", and value position is: " + (posmin+1));
        System.out.println("Position of second positive value is: " + (pos+1));
    }
}