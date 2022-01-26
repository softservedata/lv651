package com.software.edu.hw12.practicalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter width of rectangle: ");
        try{
            int weight = Integer.parseInt(br.readLine());
            System.out.print("Enter length of rectangle: ");
            int length = Integer.parseInt(br.readLine());
            if(length<=0 | weight <=0){
                throw new Exception("can't make input less then 0");

            }
            System.out.println("Area of rectangle is: " + squareRectangle(length, weight));
        } catch (NumberFormatException | IOException e) {
            System.out.println("can't enter letters.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int squareRectangle(int a, int b){
        int result = a * b;
        return result;
    }
}
