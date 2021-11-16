package com.softserve;

import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {
        calculation();
        greetings();
        showFlowerBedProperties();
        someInfo();
        callsCost();
    }

    public static void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();

        System.out.println("Subtraction is: " + (a - b));
        System.out.println("Sum is: " + (a + b));
        System.out.println("multiplication is: " + (a * b));
        System.out.println("Division is: " + (a / b));
    }

    public static void greetings() {
        Scanner scn = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scn.nextLine();
        System.out.println("You are " + answer + ".");
    }

    public static void showFlowerBedProperties() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Perimeter is: " + perimeter + " and area is " + area + ".");
    }

    public static void someInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println("Your name is: " + name + "." + " Your living location is: " + address + ".");
    }

    public static void callsCost() {
        Scanner sc = new Scanner(System.in);
        int c1 = 2;
        int c2 = 3;
        int c3 = 4;
        System.out.println("How long time was your phone call?");
        int t1 = sc.nextInt();
        System.out.println("Calls cost are: " + "\nCountry1: " + c1 * t1 + "."
                + "\nCountry2: " + c2 * t1 + "." + "\nCountry3: " + c3 * t1 + ".");
        System.out.println("How long time was your phone call?");
        int t2 = sc.nextInt();
        System.out.println("Calls cost are: " + "\nCountry1: " + c1 * t2 + "."
                + "\nCountry2: " + c2 * t2 + "." + "\nCountry3: " + c3 * t2 + ".");
        System.out.println("How long time was your phone call?");
        int t3 = sc.nextInt();
        System.out.println("Calls cost are: " + "\nCountry1: " + c1 * t3 + "."
                + "\nCountry2: " + c2 * t3 + "." + "\nCountry3: " + c3 * t3 + ".");
        int total = c1 * (t1 + t2 + t3) + c2 * (t1 + t2 + t3) + c3 * (t1 + t2 + t3);
        System.out.println(total);
    }
}
