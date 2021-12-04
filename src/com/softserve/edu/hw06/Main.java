package com.softserve.edu.hw06;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
			Car car = new  Truck ("dsdsd", 5, 6, 20000 );
			car.run();
		
		Car[] list = new Car [4];
		
		list [0] = new Truck ("Volvo", 110, 2010, 20000 ) ;
		list [1] = new Sedan ("Toyota", 2405,2014, 7 ) ;
		list [2] = new Truck ("Skania", 130, 2017, 24000 ) ;
		list [3] = new Sedan ("Smart", 2405,2014, 2 ) ;
	//	Arrays.toString(list);
		
		for (Car k : list) {
			
		System.out.println(k);
		}
//		System.out.println(Arrays.toString(list) );
//		System.out.println();
		
		
	}

}
