package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr1 {

	public static void main(String[] args) {
		int N = 10;
		MyCollectionWrapper myCollection = new MyCollectionWrapper(N);
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			if (true) {
				Random ran = new Random();
				int value = ran.nextInt(N * N) + 1;
				myCollection.add(value);
			} else {
				System.out.print(String.format("Enter integer value #%d/%d: ", i + 1, N));
				String input = s.nextLine();
				try {
					int value = Integer.parseInt(input);				
					myCollection.add(value);
				} catch (NumberFormatException e) {
					System.err.println("Invalid number, please re-type.");
					i--;
					continue;
				}
			}
		}
		
		System.out.println(String.format("Your collection is: %s", myCollection));
		
		/*
		 * Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
		 */
		int point1 = 5;
		
		MyCollectionWrapper newCollection1 = new MyCollectionWrapper();
		for (int i = 0; i < N; i++) {
			if (myCollection.get(i) > point1) {
				newCollection1.add(i);
			}
		}
		System.out.println(String.format("Indices with values more than %d: %s", point1, newCollection1));
		
		
		MyCollectionWrapper newCollection2 = new MyCollectionWrapper();
		Iterator<Integer> iterator = myCollection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			if (iterator.next() > point1) {
				newCollection2.add(i);
			}
			i++;
		}
		System.out.println(String.format("Indices with values more than %d: %s", point1, newCollection2));
		
		/*
		 * Remove from collection myCollection elements, which are greater than 20. Print result
		 */
		
		int point2 = 20;
		
		
		try {
			MyCollectionWrapper newCollection3 = myCollection.clone();
			for (Integer value: myCollection) {
				if (value > point2) {
					newCollection3.remove(value);
				}
			}
			System.out.println(String.format("Collection without values greater than %d: %s", point2, newCollection3));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Integer> newCollection4 = myCollection
			.stream()
			.map(value -> value)
			.filter(value -> value <= 20)
			.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
		System.out.println(String.format("Collection without values greater than %d: %s", point2, newCollection4));
		
		/*
		 * Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx” 
		 */
		try {
			MyCollectionWrapper newCollection5 = myCollection.clone();
			newCollection5.add(2, 1);
			newCollection5.add(8, -3);
			newCollection5.add(5, -4);
			int j = 0;
			for (Integer value: newCollection5) {
				System.out.println(String.format("Position – %d, value of element – %d", j, value));
				j++;
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		/*
		 * Sort and print collection
		 */
		myCollection.sort(new MyCollectionComparatorAsc());
		System.out.println(String.format("Sorted collection ASC: %s", myCollection));
		
		myCollection.sort(new MyCollectionComparatorDesc());
		System.out.println(String.format("Sorted collection DESC: %s", myCollection));
	}

}

class MyCollectionWrapper implements Cloneable, Iterable<Integer> {
	private ArrayList<Integer> collection;
	
	public MyCollectionWrapper() {
		this.collection = new ArrayList<Integer>();
	}
	
	public MyCollectionWrapper(int N) {
		this.collection = new ArrayList<Integer>(N);
	}
	
	public MyCollectionWrapper(ArrayList<Integer> collection) {
		this.collection = new ArrayList<Integer>(collection);
	}
	
	public boolean add(Integer value) {
		return this.collection.add(value);
	}
	
	public void add(int index, Integer value) {
		this.collection.add(index, value);
	}
	
	public boolean remove(Integer value) {
		return this.collection.remove(value);
	}
	
	public String toString() {
		return this.collection.toString();
	}
	
	public Iterator<Integer> iterator() {
		return this.collection.iterator();
	}
	
	public Integer get(int index) {
		return this.collection.get(index);
	}
	
	public Stream<Integer> stream() {
		return this.collection.stream();
	}
	
	protected MyCollectionWrapper clone() throws CloneNotSupportedException {
		MyCollectionWrapper dest = new MyCollectionWrapper(this.collection);
		return dest;
	}
	
	public void sort(MyCollectionComparator comparator) {
		this.collection.sort(comparator);
	}
}

abstract class MyCollectionComparator implements Comparator<Integer> {
}

class MyCollectionComparatorAsc extends MyCollectionComparator {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg0 - arg1;
	}
}

class MyCollectionComparatorDesc extends MyCollectionComparatorAsc {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return -1 * super.compare(arg0, arg1);
	}
}