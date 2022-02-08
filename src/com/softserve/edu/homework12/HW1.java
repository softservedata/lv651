package com.softserve.edu.homework12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HW1 {
    public static void main(String[] args) {

        Predicate<String> predicate1 = (s) -> s.length() <= 5;
        List<String> list1 = Arrays.asList("Angel", "Aaron", "Bob", "Claire", "David","Andriana","Stanislav");
        System.out.println("Origin: " + list1);
        List<String> list2 = list1.stream()
                .filter(predicate1)
                .collect(Collectors.toList());
        System.out.println("Modify: " + list2);
    }
}
