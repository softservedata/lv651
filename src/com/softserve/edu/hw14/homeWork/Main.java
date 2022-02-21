package com.software.edu.hw14.homeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    static String encrypt(String s, int n) {
        StringBuilder encStr = new StringBuilder();
        s.chars()
                .map(ch -> (ch+n))
                .forEach(encStr::appendCodePoint);
        return encStr.toString();
    }

    static String decrypt(String s, int n) {
        StringBuilder encStr = new StringBuilder();
        s.chars()
                .map(ch -> (ch-n))
                .forEach(encStr::appendCodePoint);
        return encStr.toString();
    }

    static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
    }

    public static void main(String[] args) {
        Predicate<String>predicate = s-> s.length()<=5;
        List<String> list1 = Arrays.asList("Angela","Denis","Bob","Claire","Emily");
        System.out.println("Original: "+ list1);

        List<String> list2 = list1.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println("Modify: "+ list2);



        System.out.println("\nencrypt(abc, 3): " + encrypt("vjld", 3));
        System.out.println("decrypt(def, 3): " + decrypt("dghi", 3));

        LocalDate today = LocalDate.now();
        System.out.println("\ndate according to format mm.dd.yy: " + formatDate(today));
    }
}
