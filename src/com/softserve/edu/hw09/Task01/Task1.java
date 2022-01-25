package com.softserve.edu.hw09.Task01;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(5);
        set1.add(7);
        set1.add(6);
        set2.add(5);
        set2.add(2);
        set2.add(8);

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
}