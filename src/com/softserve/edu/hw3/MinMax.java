package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MinMax {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number 1:");
        float n1 = Float.parseFloat(br.readLine());
        System.out.println("Please enter number 2:");
        float n2 = Float.parseFloat(br.readLine());
        System.out.println("Please enter number 3:");
        float n3 = Float.parseFloat(br.readLine());

        float min = Math.min(n1,n2);
        min = Math.min(min,n3);

        float max = Math.max(n1,n2);
        max = Math.max(max,n3);

        System.out.println("Minimun of three numbers: " + min);
        System.out.println("Maximum of three numbers: " + max);
    }
}
