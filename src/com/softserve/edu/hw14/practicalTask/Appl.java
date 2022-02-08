package com.software.edu.hw14.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Appl {

    public static void main(String[] args) {
        int n = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the number: ");
        try {
            n =Integer.parseInt(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        //1
        Random random = new Random();
        System.out.println("Random numbers: ");
        random.ints().limit(n).forEach(System.out::println);

        //2
        System.out.println("Sorted: ");
        random.ints().limit(n).sorted().forEach(System.out::println);







    }
}
