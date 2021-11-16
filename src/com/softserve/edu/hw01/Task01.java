package com.softserve.edu.hw01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Task01 {
    static double pi = 3.14;
    public static void main(String[] args) {
        calcPerimeter(10);
        calcArea( 10);
    }

    static void calcPerimeter(double rad) {
        double perimeter = 2 * pi * rad;
        System.out.println("Perimeter is: " + perimeter);
    }

    static void calcArea(double rad) {
        double area = pi * Math.pow(rad, 2);
        System.out.println("Area is: " + area);
    }
}
