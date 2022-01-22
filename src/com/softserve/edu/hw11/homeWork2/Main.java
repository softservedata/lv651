package com.software.edu.hw11.homeWork2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence that contains the words between more than one space: ");
        String sentence = br.readLine();

        String str = sentence.replaceAll("\\s + ", " ");
        System.out.println("Original sentence: "+sentence);
        System.out.println("Changed sentence: "+ str);

    }
}
