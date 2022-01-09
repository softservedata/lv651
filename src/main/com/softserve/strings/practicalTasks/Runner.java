package com.softserve.strings.practicalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

        String str1 = "IT";
        String str2 = "IT Academy";
        str1 = str1.substring(0, 2);
        str2 = str2.substring(0, 2);
        System.out.println("Are the beginnings are equals? " + str1.equals(str2));
    }

    public static void task2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine().toUpperCase();
        System.out.println("Enter surname: ");
        String surname = sc.nextLine().toUpperCase();
        System.out.println("Enter patronymic: ");
        String patronymic = sc.nextLine().toUpperCase();

        System.out.println("Your surname is: " + surname + "\nInitials: " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
        System.out.println("Name: " + name);
        System.out.println("Total info: " + name + " " + patronymic + " " + surname + ".");
    }

    public static void task3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names (using Latin alphabet, numbers and underscores) : ");
        String names = sc.nextLine();

        String pattern = "\\w+([a-z0-9_\\.-]{3,15}+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(names);

        for (int i = 0; i < names.length(); i++) {
            if (matcher.find()) {
                System.out.println("This name is valid: " + names.substring(matcher.start(), matcher.end()));
            }
            if (!matcher.find()) {
                System.out.println("Other names are not valid.");
                break;
            }
        }
        sc.close();
    }
}

