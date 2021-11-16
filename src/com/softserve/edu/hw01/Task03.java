package com.softserve.edu.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please insert standard unit per minute for C1? ");
            Integer c1 = Integer.valueOf(br.readLine());
            System.out.println("Please insert standard unit per minute for C2");
            Integer c2 = Integer.valueOf(br.readLine());
            System.out.println("Please insert standard unit per minute for C3");
            Integer c3 = Integer.valueOf(br.readLine());

            System.out.println("Please insert call duration for C1? ");
            Integer t1 = Integer.valueOf(br.readLine());
            System.out.println("Please insert call duration for C2? ");
            Integer t2 = Integer.valueOf(br.readLine());
            System.out.println("Please insert call duration for C3? ");
            Integer t3 = Integer.valueOf(br.readLine());

            System.out.println("Cost for C1 is: " + c1 * t1);
            System.out.println("Cost for C2 is: " + c2 * t2);
            System.out.println("Cost for C3 is: " + c3 * t3);
            int total = (c1 * t1) + (c2 * t2) + (c3 * t3);
            System.out.println("Total cost: " + total );
        }
    }



