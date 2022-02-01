package com.softserve.edu.hw10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence of 5 words (!sentence must contains 5 words!): ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        String longestWord = "";
        if (words.length == 5) {
            for (String word : words) {
                if (word.length() > longestWord.length()) longestWord = word;
            }
            System.out.println("The longest word: " + longestWord);
            System.out.println("The number of its letters: " + longestWord.length());
            System.out.println("The second word in reverse order: " + new StringBuilder(words[1]).reverse());
        }

    }
}