package com.softserve.edu.hw09.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class ListDemo1  {
	public static void main(String[] args) {
		
		
		List<Integer> myCollection   = new ArrayList<Integer>();
		List<Integer> newCollection  = new ArrayList<Integer>();
		
		Random random = new Random	();
		
		for (int i = 0; i < 15; i++) {
			myCollection .add(random.nextInt(30));  
			
		}
		
		System.out.println("myCollection			" + myCollection );
		
		for(int i =0; i < myCollection.size() ; i++) {			//fill newCollection
		       if(myCollection.get(i) <15)
		        newCollection.add(myCollection.get(i));	
		}	
	
		System.out.println("newCollection			" + newCollection );

		
		Iterator<Integer> iterator = myCollection.iterator();
		while(iterator.hasNext()) {
			int current = iterator.next();
			if(current>20)	{
			iterator.remove();	
			}
		}
				
		System.out.println("myCollection without >20	" + myCollection );
		
		myCollection.add(1, +2);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		
		for(int i =0; i < myCollection.size() ; i++) 
			System.out.println("position "+ i+"	value of element - "+myCollection.get(i));
		
		Collections.sort(myCollection);
		System.out.println("myCollection sorted	" + myCollection );
		
		

	}


}