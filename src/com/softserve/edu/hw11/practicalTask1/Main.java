package com.software.edu.hw11.practicalTask1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first String line: ");
        String s1 = br.readLine().toUpperCase(Locale.ROOT);

        System.out.print("Enter second String line: ");
        String s2 = br.readLine().toUpperCase(Locale.ROOT);
        int n = s2.indexOf(s1);

        if(n>=0){
            System.out.println("String s1 is substring s2");
        }

        else System.out.println("String s1 isn't substring s2");
    br.close();
    }
}
