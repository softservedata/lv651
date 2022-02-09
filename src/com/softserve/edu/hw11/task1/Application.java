package com.softserve.edu.hw11.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            readNumber(5, 10);
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }

    }

    public static int readNumber(int start, int end) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("number=");
            int number = Integer.parseInt(br.readLine());
            if (number < start || number > end) {
                throw new Exception("Number is out of range!");
            }
            return number;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;

        }
    }
}






