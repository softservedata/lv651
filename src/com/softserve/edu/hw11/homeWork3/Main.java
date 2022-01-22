package com.software.edu.hw11.homeWork3;
import java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the text of currency amount in $: ");
        float fl = Float.parseFloat(br.readLine());

        System.out.println("Entered amount " + fl + " $.");
        float counted = fl * 28;
        String formatStr = "%S is = %.2f";

        String currency = String.format(formatStr, "$", counted);

        System.out.print("Your input: " + fl + " " + currency + " hrn.");

        br.close();
    }
}
