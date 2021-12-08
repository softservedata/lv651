package com.firstlect;

import java.util.Scanner;

public class HomeW01Ploscha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть радіус клумби: ");
        double radius = s.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Площа клумби дорівнює: " + area);
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Периметр клумби = " + perimeter);
        s.close();
    }
}
