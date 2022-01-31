package com.softserve.edu.hw10.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Head {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence of five words: ");
        String sentence = sc.nextLine();

        System.out.println("Your sentence is: "+sentence+ ".");

        String[] word = sentence.split(" ");
        String longWord;
        List<String> list = Arrays.asList(word);
        longWord = Collections.max(list);
        System.out.println("This is the longest word in your sentence: " + longWord);


        int length = longWord.length();
        System.out.println("Length of the longest word: " + length);

        String[] sw = sentence.split(" ");
        String secondWord = sw[1];
        System.out.println("Second word is: " + secondWord);

        char ch;
        StringBuilder rev = new StringBuilder();
        for (int i=0; i<secondWord.length(); i++)
        {
            ch= secondWord.charAt(i);
            rev.insert(0, ch);
        }

        System.out.println("Reversed word: "+ rev);
    }
}



