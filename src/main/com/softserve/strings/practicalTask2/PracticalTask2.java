package com.softserve.strings.practicalTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PracticalTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, surname and patronymic: ");
        String input = sc.nextLine();
        ArrayList<String> fullname = new ArrayList<>(Arrays.asList(input.split(" ")));

        System.out.println("Name: " + getName(fullname.get(0)));
        System.out.println("Surname and Initials: " + getSurname(fullname.get(1)) + " "
                + getInitials(fullname.get(0)) + " "
                + getInitials(fullname.get(2)));
        System.out.println("Fullname: " + getSurname(fullname.get(1)) + " "
                + getName(fullname.get(0)) + " "
                + getPatronymic(fullname.get(2)));

    }

    public static String getName(String name) {
        return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1);
    }

    public static String getInitials(String init) {
        return init.substring(0, 1).toUpperCase(Locale.ROOT);
    }

    public static String getSurname(String surname) {
        return surname.substring(0, 1).toUpperCase(Locale.ROOT) + surname.substring(1);
    }

    public static String getPatronymic(String patronymic) {
        return patronymic.substring(0, 1).toUpperCase(Locale.ROOT) + patronymic.substring(1);
    }
}
