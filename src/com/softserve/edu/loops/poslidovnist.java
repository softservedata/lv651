package com.softserve.edu.loops;

public class poslidovnist {

	public static void main(String[] args) {
		
		double arr [] = new double [20]; 
		arr [0] = 0;
		arr [1] = 5./8.;
		
		for (int i = 2; i<arr.length; i++)
			arr[i]=(arr[i-1])/2.+.75*arr[i-2];
		
		for (int i = 0; i<arr.length; i++)
		
		System.out.println("x"+i+"	= "+arr[i]);
				
	}

}
