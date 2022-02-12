package com.softserve.edu.hw13.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Appl {
    public static void main(String[] args) {

        List<String> list1 = List.of("Lviv", "Odesa", "Dnipro", "",
                "Ternopil", "Sumy", "Chernihiv", "Lutsk", "kyiv", "Zhytomyr");
        System.out.println("Origin list: " + list1);
        Predicate<String> predicate1 = ( s -> s.length() > 5);

        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf(predicate1);
        System.out.println("Modified list: " + list2);

    }

}
