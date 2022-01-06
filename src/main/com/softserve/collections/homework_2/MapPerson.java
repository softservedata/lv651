package com.softserve.collections.homework_2;

import java.util.*;

public class MapPerson {
    public static void main(String[] args) {
        Map<String, String> mapPerson = new HashMap<>();
        mapPerson.put("Popova", "Anna");
        mapPerson.put("Sterniuk", "Yura");
        mapPerson.put("Derkun", "Galina");
        mapPerson.put("Sayadova", "Katya");
        mapPerson.put("Grinev", "Yura");
        mapPerson.put("Pilkin", "Dima");
        mapPerson.put("Gurskaya", "Diana");
        mapPerson.put("Gur", "Diana");
        mapPerson.put("Filipov", "Oleg");
        mapPerson.put("Dmitriev", "Nazar");
        mapPerson.put("Tishko", "Tima");

        System.out.println(mapPerson);

        List<String> foundValues = new ArrayList<>();

        Iterator<Map.Entry<String, String>> iterator = mapPerson.entrySet().iterator();
        while(iterator.hasNext()){
            String entryValue = iterator.next().getValue();
            if (!foundValues.contains(entryValue)) {
                foundValues.add(entryValue);
            } else {
                iterator.remove();
            }
        }

        System.out.println(mapPerson);
    }
}




