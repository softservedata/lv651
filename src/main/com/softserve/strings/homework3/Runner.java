package com.softserve.strings.homework3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Implement a pattern for US currency: the first symbol "$", then any number of digits,
        // dot and two digits after the dot. Enter the text from the console that contains several
        // occurrences of US currency. Display all occurrences on the screen.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency amount in $: ");
        float input = sc.nextFloat();

        System.out.println("Entered amount " + input + " $.");
        float counted = input * 28;
        String formatStr = "%S is =%8.2f\n";

        String currency = String.format(formatStr, "$", counted);
        System.out.println("Your input: " + input + " " + currency + " hrn.");
    }
}
