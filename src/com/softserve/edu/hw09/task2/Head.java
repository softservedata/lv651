package com.softserve.edu.hw09.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Head {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Trush" , "Nestor");
        personMap.put("Fedyshyn" , "Oleg");
        personMap.put("Poroshenko" , "Petro");
        personMap.put("Gordeichyk" , "Vova");
        personMap.put("Slusar", "Pavlo");
        personMap.put("Barak" , "Obama");
        personMap.put("Trump", "Orest");
        personMap.put("Parker", "Peter");
        personMap.put("Konovart", "Ivan");
        personMap.put("Ivanov", "Ivan");

        System.out.println(personMap);

        System.out.println("Remove the person with name 'Orest'");

        String valToRemove = "Orest";
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();

        HashSet<String> valueSet = new HashSet<String>();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (!valueSet.add(entry.getValue())) {
                System.out.println("Some persons has the same name: " + entry.getValue());
            }
            if (valToRemove.equals(entry.getValue())) {
                iterator.remove();
            }
        }

        System.out.println(personMap);
    }
}
