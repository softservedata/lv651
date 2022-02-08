package com.company.edu.HW11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println(HW11.div());

        System.out.println("Task2");
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter first number:");
        numbers.add(HW11.readNumber(1, 100));
        for(int i=0; i<9; i++){
            System.out.println("Enter "+(i+2)+" number:");
            numbers.add(HW11.readNumber(numbers.get(i), 100));
        }
        System.out.print("Output:\n 1<");
        for(int i=0; i< numbers.size(); i++){
            System.out.print(numbers.get(i)+"<");
        }
        System.out.println("100");
    }
}
