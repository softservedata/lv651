package com.softserve.edu.homework8.HomeWork;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Domchuk", "Andrii");
        personMap.put("Demchuk", "Maxim");
        personMap.put("Movshan", "Oleg");
        personMap.put("Shevshuk", "Oleg");
        personMap.put("Musii", "Nazar");
        personMap.put("Ukhman", "Andrii");
        personMap.put("Madaii", "Stanislav");
        personMap.put("Klapak", "Stanislav");
        personMap.put("Vinar", "Andrii");
        personMap.put("Shveda", "Oksana");

        System.out.println(personMap);

        Collection<String> list = personMap.values();
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            if (Collections.frequency(list, itr.next()) > 1) {
                itr.remove();
            }
        }

        System.out.println(personMap);
    }
}
