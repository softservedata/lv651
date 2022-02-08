package com.software.edu.hw14.homeWork;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Predicate<String>predicate = s-> s.length()<=5;
        List<String> list1 = Arrays.asList("Angela","Denis","Bob","Claire","Emily");
        System.out.println("Original: "+ list1);

        List<String> list2 = list1.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println("Modify: "+ list2);
    }
}
