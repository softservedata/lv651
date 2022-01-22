package com.software.edu.hw11.homeWork1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter sentence of five words: ");
        String sentence = br.readLine();

        String[]arr = sentence.split(" ");
        //System.out.println(Arrays.toString(arr));

        List<String> sentList = Arrays.asList(arr);

        String max = Collections.max(sentList);
        System.out.println("The longest word in the sentence is: "+ max);
        System.out.println("The number of its letters: "+max.length());

        StringBuilder buffer = new StringBuilder(arr[1]);
        buffer.reverse();
        System.out.println("The second word in reverse order: "+buffer);
    }
}
