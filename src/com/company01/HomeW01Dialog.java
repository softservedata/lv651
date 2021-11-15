package com.company01;

import java.util.Scanner;

public class HomeW01Dialog {
    public static void main(String[] args) {
        System.out.println(" Task 2");
        System.out.println("How are you?");
        Scanner sc = new Scanner(System.in);
        String variable = sc.nextLine();
        System.out.println("You are "+variable);
        System.out.println("And what is ur name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Where are you live, "+ name+ "?");
        String adress = s.nextLine();
        System.out.println("So, "+ name+" you r living at "+ adress+" huh.");
    }
}
