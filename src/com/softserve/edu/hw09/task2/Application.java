package com.softserve.edu.hw09.task2;

import com.softserve.edu.hw09.task3.Student;

import java.sql.SQLOutput;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Petrov", "Ivan");
        personMap.put("Check", "Ihor");
        personMap.put("Prytula", "Nestor");
        personMap.put("Medvid", "Ivan");
        personMap.put("Kyrpa", "Roman");
        personMap.put("Karpa", "Iryna");
        personMap.put("Koval", "Anna");
        personMap.put("Melnyk", "Ivan");
        personMap.put("Kit", "Yakiv");
        personMap.put("Sadova", "Oksana");
        System.out.println(personMap);
        personMap.remove("Karpa");
        System.out.println(checkDuplicates(personMap));
        removePerson(personMap, "Anna");
        System.out.println(personMap);

    }
    public static void removePerson(Map<String, String> personMap, String person){
        String keyToDelete = "";
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(person)) {
                keyToDelete = entry.getKey();
            }
        }
        personMap.remove(keyToDelete);
    }

    public static boolean checkDuplicates(Map<String, String> personMap){
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
                if (entry.getValue().equals(entry2.getValue())&&!entry.getKey().equals(entry2.getKey())) {
                   return true;
                }
            }
        }
        return false;
    }
}