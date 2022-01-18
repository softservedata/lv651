package com.software.edu.hw10.homeWork1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet(Arrays.asList("Vlad","Danil","Ira","Ivan"));
        Set<String> set2 = new HashSet(Arrays.asList("Vika","Kate","Nina","Denis"));
        Set<String> intersectResult = intersect(set1,set2);
        System.out.println("Union Method: "+ union(set1,set2));
        System.out.println("\nIntersect Method: "+ intersectResult);
    }

    public static <T> Set<T> union(Set set1, Set set2){
    Set<T> set = new HashSet<T>();
    set.addAll(set1);
    set.addAll(set2);

    return new HashSet<>(set);
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){

        Set<T> intersectionSet = new HashSet<>();
        for (T element : set1) {
            for (T elementSet2 : set2) {
                if (element.equals(elementSet2)) {
                    intersectionSet.add(elementSet2);
                }
            }
        }
        return intersectionSet;
    }
}
