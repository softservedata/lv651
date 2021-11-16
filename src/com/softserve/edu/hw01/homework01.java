package com.software.edu.hw01;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1: ");
        System.out.print("Put a = ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Put b = ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        //
        System.out.println("\nTask 2: ");
        System.out.print("How are you?? ");
        String mood = br.readLine();
        System.out.println("You are "+ mood);

        //
        System.out.println("\nHomework \nTask №1: ");
        double pi = 3.14159;
        System.out.print("Enter the radius of flower bed : ");
        int radius = Integer.parseInt(br.readLine());
        System.out.println("The perimeter of your flower bad = "+(2 * pi * radius));
        System.out.println("The area of your flower bad = "+(pi*(radius*radius)));

        //
        System.out.println("\nTask №2:");
        System.out.print("What's your name?: ");
        String name = br.readLine();

        System.out.print("Where are you live, " + name + " ? : ");
        String address = br.readLine();

        System.out.println("\nYour name's "+name+"\nAnd you live in "+ address);

        System.out.println("\nTask №3:");
        System.out.print("Put price per 1 minutes for 1st country: ");
        float c1 = Float.parseFloat(br.readLine());
        System.out.print("Put price per 1 minutes for 2nd country: ");
        float c2 = Float.parseFloat(br.readLine());
        System.out.print("Put price per 1 minutes for 3th country: ");
        float c3 = Float.parseFloat(br.readLine());

        System.out.print("\nHow long the 1st call lasted : ");
        float t1 = Float.parseFloat(br.readLine());
        System.out.print("How long the 2nd call lasted : ");
        float t2 = Float.parseFloat(br.readLine());
        System.out.print("How long the 3th call lasted : ");
        float t3 = Float.parseFloat(br.readLine());

        float price1 = c1 * t1;
        float price2 = c2 * t2;
        float price3 = c3 * t3;

        float all_prices = price1 + price3 + price2;

        System.out.println("\nPrice for 1st call: "+price1);
        System.out.println("Price for 2nd call: "+price2);
        System.out.println("Price for 3th call: "+price3);
        System.out.println("Price for all calls together: "+all_prices);

    }
}
