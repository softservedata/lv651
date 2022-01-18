package com.software.edu.hw10.homeWork2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap();
        personMap.put("Hryshko","Vlad");
        personMap.put("Sterniuk","Ira");
        personMap.put("Fillipov","Orest");
        personMap.put("Ivanov","Vova");
        personMap.put("Movchan","Kate");
        personMap.put("Lesnyak","Maria");
        personMap.put("Shevchenko","Dmitro");
        personMap.put("Gura","Tanya");
        personMap.put("Navi","Vova");
        personMap.put("Tishko","Sonya");

        System.out.println(personMap);

        List<String>foundValues = new ArrayList<>();
        Iterator<Map.Entry<String,String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()){
            String entryValue = iterator.next().getValue();
            if(!foundValues.contains(entryValue)){
                foundValues.add(entryValue);
            }
            else iterator.remove();
        }

        System.out.println(personMap);
    }
}
