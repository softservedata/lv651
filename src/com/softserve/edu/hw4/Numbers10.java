package com.softserve.edu.hw4;
import java.util.Scanner;

public class Numbers10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0, prod = 1;
        boolean isPositive = true;

        System.out.println("Enter 10 integer numbers: ");
        for (int n = 0; n < arr.length; n++) {
            arr[n] = sc.nextInt();
            if (n < arr.length/2 && arr[n]<0){
                isPositive = false;
            }
        }
        if (isPositive){
            for (int n = 0; n < arr.length/2; n++){
                sum = sum + arr[n];
            }
        }
        else {
            for (int n = arr.length/2; n < arr.length; n++) {
                prod = prod * arr[n];
            }
        }
         if (isPositive) {
            System.out.println("Sum of first 5 elements: " + sum);
        } else {
            System.out.println("Product of last 5 elements: " + prod);
        }
    }
}