package com.software.edu.hw14.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;


public class Appl {
    static LocalDate firstMonday(LocalDate date) {
        LocalDate date1 = date.withDayOfMonth(1);
        int day = date1.getDayOfWeek().getValue() - 1;
        if (day == 0) {
            date = date.withDayOfMonth(1);
        } else {
            date = date.withDayOfMonth(8 - day);
        }
        return date;
    }

    static void sortStringLIst(List<String> list) {
        list.sort(String::compareTo);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int n = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the number: ");
        try {
            n =Integer.parseInt(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //1
        Random random = new Random();
        System.out.println("Random numbers: ");
        random.ints().limit(n).forEach(System.out::println);

        //2
        System.out.println("Sorted: ");
        random.ints().limit(n).sorted().forEach(System.out::println);

        //3
        List<Integer> numbers = Arrays.asList(100, 71, 2, 4, -10, 5, 234, 65);
        System.out.print("\nShow the biggest number from: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.print("\nThe biggest number is: " + numbers.stream().mapToInt(x -> x).max().getAsInt());

        //4
        System.out.println("\n\nToday is " + date.getDayOfWeek());

        //5
        System.out.println("\nDate of first Monday for current month: " + Appl.firstMonday(date).getDayOfMonth());

        //6
        System.out.print("\nAppl.sortStringLIst(strings): ");
        List<String> strings = Arrays.asList("Vdf", "skd", "qadg", "acd");
        Appl.sortStringLIst(strings);
        System.out.println(strings);

    }
}
