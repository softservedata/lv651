package com.softserve.edu.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
    public static void main(String[] args) throws IOException {

        floatNumbers();
        integerNumbers();
        errors();
    }

    private static void floatNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write down first float number:");
        float a = Float.parseFloat(br.readLine());
            if (a <= 5 && a >= -5) {
                System.out.println("this number belongs to the range [-5, 5]");
            } else {
             System.out.println("this number does not belong to the range [-5,5]");
            }
        System.out.println("Write down second float number:");
        float b = Float.parseFloat(br.readLine());
            if (b <= 5 && b >= -5) {
                System.out.println("this number belongs to the range [-5, 5]");
            } else {
                System.out.println("this number does not belong to the range [-5,5]");
            }
        System.out.println("Write down third float number:");
        float c = Float.parseFloat(br.readLine());
            if (c <= 5 && c >= -5) {
                System.out.println("this number belongs to the range [-5, 5]");
            } else {
                System.out.println("this number does not belong to the range [-5,5]");
            }
    }
    private static void integerNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write down first integer number:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Write down second integer number:");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Write down third integer number:");
        int c = Integer.parseInt(br.readLine());

        System.out.print("Minimum number ");
        System.out.println(Math.min(Math.min(a, b), c));
        System.out.print("Maximum number ");
        System.out.println(Math.max(Math.max(a, b), c));
    }
    public static void errors() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter error number(400, 401, 402...) ");
        int error = Integer.parseInt(br.readLine());


        switch (error) {
            case 400:
                System.out.println(com.softserve.edu.homework3.error.BadRequest);
                break;
            case 401:
                System.out.println(com.softserve.edu.homework3.error.Unauthorized);
                break;
            case 402:
                System.out.println(com.softserve.edu.homework3.error.PaymentRequired);
                break;
        }
    }
}
