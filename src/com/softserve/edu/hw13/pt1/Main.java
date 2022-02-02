/**
 * Print n random numbers on console using Java 8
 * Print n random numbers on console using Java 8 in a sorted order
 * Using Java 8 show the biggest number from n random numbers
 */
package com.softserve.edu.hw13.pt1;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        Random random = new Random();


        int countOfNumbers = 10;
        int bound = 50;
        System.out.println("countOfNumbers: " + countOfNumbers);


        List<Integer>  randomList = Stream                             // Fill list ramdom numbers
                .generate(() -> random.nextInt(bound))
                .limit(countOfNumbers)
                .collect(Collectors.toList());
        System.out.println("Origin: " + randomList);


        List<Integer> sortedList = randomList.stream()                 // Sort list
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedList);


        Integer maxNumber = sortedList.stream()                        // Find max array item
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("MaxNumber:  " + maxNumber);



    }
}
