package com.softserve.strings.homework1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence that consists of five words: ");
        String str = sc.nextLine();

        //Finding the longest word in the sentence
        String[] word = str.split(" ");
        String longWord = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= longWord.length()) {
                longWord = word[i];
            }
        }
        System.out.println("This is the longest word in sentence: " + longWord);

        //Getting the length of the longest word
        int length = longWord.length();
        System.out.println("The length of longest word is: " + length);

        //Getting second word out of sentence
        String[] splittedSentence = str.split(" ");
        String secondWord = splittedSentence[1];
        System.out.println("This is second word in sentence: " + secondWord);

        char[] arr = secondWord.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        //turning char into String
        String charToStr = String.valueOf(arr);
        System.out.println("From char to String : " + charToStr);
        //Reversing the word
        System.out.println("Reversed word: " + reverse(charToStr));
    }

    private static String reverse(String reversedWord) {
        String word[] = reversedWord.split("\\s");
        String reverse = "";
        for (String w : word) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverse += sb.toString();
        }
        return reverse.trim();
    }

}



