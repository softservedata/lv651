package com.softserve.edu12list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplList {
	public static void main(String[] args) {
		/*
		List my = new ArrayList(); // raw type
		my.add(123);   // add Integer
		my.add("abc"); // add String
		int k = (int) my.get(0) + 1;
		System.out.println("k = " + k);
		*/
		/*-
		String[] arrStr = { "222", "1", "1111", "10" };
		System.out.println("arrStr = " + arrStr);
		System.out.println("arrStr = " + Arrays.toString(arrStr));
		//
		List<String> lstStr = Arrays.asList(arrStr);
		System.out.println("lstStr = " + lstStr);
		arrStr[1] = "001";
		// lstStr.clear();// Error
		System.out.println("Changed lstStr = " + lstStr);
		//Arrays.sort(arrStr);
		Collections.sort(lstStr);
		//lstStr.sort((a,b)->a.compareTo(b));
		System.out.println("Sorted lstStr = " + lstStr);
		*/
		/*-
		String[] arrStr = { "222", "1", "1111", "10" };
		List<String> lstStr = new ArrayList<>(Arrays.asList(arrStr));
		//List<String> lstStr = new ArrayList<>();
		lstStr.add("222");
		lstStr.add("001");
		lstStr.add("1111");
		lstStr.add("010");
		System.out.println("Original: lstStr = " + lstStr);
		Collections.sort(lstStr);
		System.out.println("Sorted: lstStr = " + lstStr);
		lstStr.clear();
		System.out.println("stStr.clear() = " + lstStr);
		*/
		/*-
		List<Student> lstStr = new ArrayList<>();
		lstStr.add(new Student(232, "Petro"));
		lstStr.add(new Student(143, "Stepan"));
		lstStr.add(new Student(234, "Petro"));
		lstStr.add(new Student(567, "Ira"));
		lstStr.add(new Student(123, "Ivan"));
		lstStr.add(new Student(233, "Petro"));
		System.out.println("Original: lstStr = " + lstStr);
		//Collections.sort(lstStr);
		//Collections.sort(lstStr, new Student.ByDestName());
		Collections.sort(lstStr, new Student.ByNameAndAge());
		//Collections.sort(lstStr, new Student(1, "").new ByAge());
		System.out.println("\nSorted: lstStr = " + lstStr);
		//
		System.out.println("Element from 1 position: " + lstStr.get(1));
		Student st1 = new Student(145, "Stepan");
		lstStr.add(1, st1);
		System.out.println("\nUpdated: lstStr = " + lstStr);
		System.out.println("New Element from 1 position: " + lstStr.get(1));
		st1 = new Student(157, "Andriy");
		lstStr.set(4, st1);
		System.out.println("\nAfter Set Updated: lstStr = " + lstStr);
		lstStr.remove(0);
		System.out.println("\nAfter Delete Updated: lstStr = " + lstStr); // toString();
		*/
		//
		// Iterator
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
//		//
//		String element2 = list.get(1); // Call Inner Iterator
//		System.out.println("element2 = " + element2);
		//
		// Print Elements
		//System.out.println("elements: " + list); // Call Inner Iterator // toString()
		//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("list.get(" + i + ")= " + list.get(i));
//		}
		//
//		for (String current : list) { // implicit inner iterator
//			System.out.println("current = " + current);
//		}
		//
		Iterator<String> iterator = list.iterator(); // get iterator
		while (iterator.hasNext()) {
			String current = iterator.next();
			System.out.println("current: " + current);
		}
		*/
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
		// int n = list.size();
		for (int i = 0; i < list.size(); i++) {
		// for (int i = 0; i < n; i++) {
            System.out.println("Current Element = " + list.get(i));
            if (list.get(i).contains("Second")) {
                list.remove(i);
            }
        }
		//
//        for (String current : list) {
//            System.out.println(current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
        */
		// /*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
//		boolean isFound = false;
//		do {
//			isFound = false;
//			int i = 0;
//			for (i = 0; i < list.size(); i++) {
//				if (list.get(i).contains("Second")) {
//					isFound = true;
//					break;
//	            }
//			}
//			if (isFound) {
//				list.remove(i);
//			}
//		} while(isFound);
		//
		//
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		    String current = iterator.next();
		    System.out.println("element = " + current);
		    if (current.contains("Second")) {
		        iterator.remove();
		    }
		}
		// */
		// /*- 
		System.out.println("\nFinal List:");
		for (String current : list) {
		    System.out.println(current);
		}
		// */
	}
}
