package com.company.edu.hw9.task1;


import java.util.*;

public class Head {
    public static void main(String[] args) {
        /*Task1
        Set<String> set1= new HashSet<>();
        set1.add("element0");
        set1.add("element2");
        set1.add("element3");
        set1.add("element1");
        Set<String> set2= new HashSet<>();
        set2.add("element9");
        set2.add("element0");
        set2.add("element1");
        set2.add("element2");

        System.out.println("Union:"+union(set1,set2));

        System.out.println("\n");

        System.out.println("Intersection"+intersect(set1,set2));

    }
    private static  Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }

    private static Set<String> intersect(Set<String> set1, Set<String> set2) {
        Set<String> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
         */
        HashMap<String,String> personMap = new HashMap<String, String>();
        personMap.put("Fedyshyn", "Oleg");
        personMap.put("Trush", "Nestor");
        personMap.put("Konovart", "Hordii");
        personMap.put("Shira", "Volodya");
        personMap.put("Slusarenko", "Pavlo");
        personMap.put("Sukhan", "Denis");
        personMap.put("Skovorodcev", "Anatoliy");
        personMap.put("Kravchenko", "Denis");
        personMap.put("Skrubin", "Nazar");
        personMap.put("Bogohulceva", "Lina");

        System.out.println(personMap);
        String valToRemove = "Hordii";

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        HashSet<String> valueSet = new HashSet<String>();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            //to find duplicate value
            if (!valueSet.add(entry.getValue())) {
                System.out.println("Dublicate value is " + entry.getValue());
            }
            //to remove value
            if (valToRemove.equals(entry.getValue())) {
                iterator.remove();
            }
        }
        System.out.println(personMap);
    }
}
