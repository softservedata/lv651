package com.company.edu.hw9.task1;


import java.util.HashSet;
import java.util.Set;

public class Head {
    public static void main(String[] args) {
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

}
