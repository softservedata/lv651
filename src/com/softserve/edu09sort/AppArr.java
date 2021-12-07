package com.softserve.edu09sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AppArr {

	public static class ByDestInt implements Comparator<Integer> {
		@Override
		public int compare(Integer int1, Integer int2) {
			return -(int1 - int2);
		}
	}

	public static void main(String[] args) {
		//int[] arr = new int[10];
		Integer[] arr = new Integer[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		//
		System.out.println("Original Arrays: " + Arrays.toString(arr));
		//Arrays.sort(arr);
		Arrays.sort(arr, new AppArr.ByDestInt());
		System.out.println("Sorted Arrays: " + Arrays.toString(arr));
	}
}
