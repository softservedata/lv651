package com.softserve.edu.nomework9.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HM1 {
    public static void main(String[] args) {
        System.out.println("Enter in the console sentence of five words: ");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println(list);
        scanner.close();

        System.out.println("longest word in the sentence: " + Collections.max(list));

        StringBuilder sb = new StringBuilder(list.get(1));
        sb.reverse();
        System.out.println(sb.length());

        System.out.println(sb);

    }
}
