package com.softserve.edu.homework1;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How are you?");

        String answer = s.nextLine();
        System.out.println("You are " + answer);
    }
}
