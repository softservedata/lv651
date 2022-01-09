package com.softserve.strings.homework2;

public class Runner {
    public static void main(String[] args) {
        String str = "I    am      learning     Java   Core";
        String str1 = str.replaceAll("\\s + ", " ");
        str1 = str1.replaceFirst("a", "'");
        str1 = str1.replaceFirst("\\s", "");
        System.out.println("Old Sentence: " + str);
        System.out.println("New sentence: " + str1);
    }
}
