package com.softserve.edu.hw05.task1.subtask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxIntValue {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert integer number: ");
        int x = Integer.parseInt(read.readLine());
        System.out.println("Insert integer number: ");
        int y = Integer.parseInt(read.readLine());
        System.out.println("Insert integer number: ");
        int z = Integer.parseInt(read.readLine());

        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        System.out.println("The maximum value is = " + max);
        System.out.println("The minimum value is = " + min);

        }
    }

