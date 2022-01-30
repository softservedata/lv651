package com.company.edu.hw10.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW10 {
    public static String LongestWord(String s){
        String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        return longest;
    }
    public static String SecondWordReverse(String s){
        StringBuilder sbr = new StringBuilder(s.split(" ")[1]);
        return sbr.reverse().toString();

    }
    public static String DeleteExtraSpaces(String s){
        return s.replaceAll("\\s+"," ").trim();
    }
    public static void USCurrency(String s){
        String pattern = "\\$\\d+\\.\\d{1,2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        System.out.println("US currencies:");
        while (m.find()) {
            System.out.println(s.substring(m.start(), m.end()).trim());
        }
    }
}
