package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
    private int  start = 1;
    private int end = 100;


    public static int readNumber(int start, int end) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter number between " + start + " and " + end + ':' );
            int number = Integer.parseInt(br.readLine());
            if (number < start || number > end)
                throw new Exception("Number is out of range. ");

        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException | IOException");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return 0;
    }

    public static void main(String[] args) {
        readNumber(20, 100);

//  Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
    }

}
