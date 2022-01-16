package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PT1 {


    static int squareRectangle() throws Exception {
     //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("a=");
        Scanner sc = new Scanner(System.in);

            int a = Integer.parseInt(sc.nextLine());
            System.out.print("b=");
            int b = Integer.parseInt(sc.nextLine());
            sc.close();
            if (a <= 0 | b <= 0) {
                throw new Exception("Entered negative value!");
            }
            return a * b;
    }




    public static void main(String[] args) {


//            System.out.println(squareRectangle());

        System.out.println("GO!!!");
        try {

            System.out.println("Area: " + squareRectangle());


        } catch ( NumberFormatException e) {
            e.printStackTrace();

            System.err.println(" NumberFormatException! ");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}