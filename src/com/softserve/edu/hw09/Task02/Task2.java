package com.softserve.edu.hw09.Task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Hordeichuk" , "Vova");
        personMap.put("Trush" , "Nestor");
        personMap.put("Mask" , "Illon");
        personMap.put("Shevchenko" , "Taras");
        personMap.put("Pastuh", "Orest");
        personMap.put("Bulba" , "Taras");
        personMap.put("Ronaldo", "Cristiano");
        personMap.put("Messi", "Lionel");
        personMap.put("McGregor", "Konor");
        personMap.put("Klichko", "Vitalii");

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
