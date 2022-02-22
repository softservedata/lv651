package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
 * realizing the operations of union and intersection of two sets. 
 * Test the operation of these techniques on two pre-filled sets.
 */
public class Hw1 {

	public static Set intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<Integer>();
		for (Integer o: set1) {
			if (set2.contains(o)) {
				result.add(o);
			}
		}
		return result;
	}
	
	public static Set union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<Integer>(set1);
		for (Integer o: set2) {
			if (!set1.contains(o)) {
				result.add(o);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Integer[] items1 = {1, 1, 2, 3, 5, 8, 13};
		Integer[] items2 = {1, 2, 3, 5, 7, 11, 13};
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Collections.addAll(set1, items1);
		Collections.addAll(set2, items2);
		
		System.out.println(String.format("Set 1: %s", set1));
		System.out.println(String.format("Set 2: %s", set2));

		
		System.out.println(String.format("Intersect is: %s", Hw1.intersect(set1, set2)));
		System.out.println(String.format("Union is: %s", Hw1.union(set1, set2)));
	}

}