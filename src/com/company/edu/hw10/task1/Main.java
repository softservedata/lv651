package com.company.edu.hw10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Task 1");
        System.out.println("Enter your string:");
        String s= sc.nextLine();
        System.out.println("The longest word:"+HW10.LongestWord(s));
        System.out.println("Amount of letters of the longest word:"+HW10.LongestWord(s).chars().count());
        StringBuilder sbr = new StringBuilder(HW10.SecondWordReverse(s));
        System.out.println("Second word backwards:"+HW10.SecondWordReverse(s));

        System.out.println("\nTask 2");
        System.out.println("Enter string with extra spaces:");
        s=sc.nextLine();
        System.out.println("Your string without extra spaces:"+HW10.DeleteExtraSpaces(s));

        System.out.println("\nTask 3");
        System.out.println("Enter message with US currencies:");
        s=sc.nextLine();
        HW10.USCurrency(s);
    }
}
