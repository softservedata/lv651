package com.softserve.edu.homework1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How much does a call from America cost per minute?");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("How much does a call from Brazil cost per minute?");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("How much does a call from England cost per minute?");
        int c3 = Integer.parseInt(br.readLine());

        System.out.println("How many minutes with America?");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("How many minutes with Brazil?");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("How many minutes with England");
        int t3 = Integer.parseInt(br.readLine());

        int result1 = c1 * t1;
        int result2 = c2 * t2;
        int result3 = c3 * t3;

        System.out.println("Count America = " + result1);
        System.out.println("Count Brazil = " + result2);
        System.out.println("Count England = " + result3);
        System.out.println("Count all = " + (result1 + result2 + result3));







    }
}
