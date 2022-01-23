package com.softserve.exceptions.practicalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions1 {
    public static void main(String[] args) {
        result();
    }

    public static void result() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter side1 of rectangle: ");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter side2 of rectangle: ");
            int b = Integer.parseInt(br.readLine());
            if (a < 0 | b < 0) {
                throw new Exception("can't make input less then 0");
            }
            System.out.println("Area of rectangle is: " + squareRectangle(a, b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("can't enter letters.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        int s = 0;
        return s = a * b;

    }
}
