package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Range {
    private final float min = -5;
    private final float max = 5;

    public static boolean inRange(float n){
        return n > -5 &&  n < 5;
    }
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number 1:");
        float n1 = Float.parseFloat(br.readLine());
        System.out.println("Please enter number 2:");
        float n2 = Float.parseFloat(br.readLine());
        System.out.println("Please enter number 3:");
        float n3 = Float.parseFloat(br.readLine());

        System.out.println(inRange(n1) && inRange(n2) && inRange(n3));
    }


}
