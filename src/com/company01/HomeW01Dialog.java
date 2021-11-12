package com.company01;

import java.util.Scanner;

public class HomeW01Dialog {
    public static void main(String[] args) {
        System.out.println("What is ur name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Where are you live, "+ name+ "?");
        String adress = s.nextLine();
        System.out.println("So, "+ name+" you r living at "+ adress+" huh.");
    }
}
