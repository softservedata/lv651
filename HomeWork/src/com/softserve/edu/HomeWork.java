package com.softserve.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /// First Task
        System.out.print("Put number a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Put number b: ");
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;
        int vid = a - b;
        int mnz = a * b;
        int dil = a / b;

        System.out.println("Result sum " + sum);
        System.out.println("Result vid " + vid);
        System.out.println("Result mnz " + mnz);
        System.out.println("Result dil " + dil);

        ///Second Task
        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());
        System.out.println("You are " + age);

        /// Third Task
        System.out.println("Put radius of flower bed: ");
        int rad = Integer.parseInt(br.readLine());

        double per = rad * 2 * 3.14159;
        double are = rad * rad * 3.14159;
        System.out.println("Perimeter: " + per);
        System.out.println("Area: " + are);

        ///Fourth Task
        System.out.println("What is your name? ");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String adress = br.readLine();
        System.out.println("Your name is " + name + " and you live in " + adress);

        ///Fifth Task
        System.out.println("Put price in minute 1: ");
        int pr1 = Integer.parseInt(br.readLine());
        System.out.println("Put price in minute 2: ");
        int pr2 = Integer.parseInt(br.readLine());
        System.out.println("Put price in minute 3: ");
        int pr3 = Integer.parseInt(br.readLine());

        System.out.println("Put time 1: ");
        int time1 = Integer.parseInt(br.readLine());
        System.out.println("Put time 2: ");
        int time2 = Integer.parseInt(br.readLine());
        System.out.println("Put time 3: ");
        int time3 = Integer.parseInt(br.readLine());

        int price1 = pr1 * time1;
        int price2 = pr2 * time2;
        int price3 = pr3 * time3;

        int all_price = price1 + price2 + price3;

        System.out.println("Price for first call: " + price1);
        System.out.println("Price for second call: " + price2);
        System.out.println("Price for third call: " + price3);
        System.out.println("Price for all call together: " + all_price);
    }
}
