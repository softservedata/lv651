package com.softserve.edu.loops;

import java.util.Scanner;




public class Century {
	
	public static void main(String[] args) {
		 int c;
		System.out.println(" Input year: ");
		Scanner sc = new Scanner(System.in);
		int year = Integer.parseInt(sc.nextLine());
	sc.close();
		
//		if (year%100 >= 1)
//		
//			c = year/100+1;
//		
//		else 
//			c = year/100;
			int b;
		b = year %100 >=1 ? (c = year / 100 + 1) : (c = year/100);
		System.out.println(c + " century");
		
	}
	
	
	

}
