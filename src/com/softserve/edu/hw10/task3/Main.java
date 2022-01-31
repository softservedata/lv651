package com.softserve.edu.hw10.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String pattern = "\\$\\d+\\.\\d{2}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
            String text = scanner.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);

        System.out.println("\nResult");
            m.reset();
            while (m.find()) {
                System.out.print(text.substring(m.start(), m.end()).trim() + " ");
            }
    }
}
