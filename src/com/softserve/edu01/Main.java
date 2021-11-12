package com.softserve.edu01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*-
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Hello. What is your name? ");
        String name = br.readLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }
}
