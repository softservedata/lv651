package com.softserve.edu.hw09.set;


import java.util.HashSet;
import java.util.Set;

public class ApplMain<T> {
	
	private static Set<?> union(Set<?> s1, Set<?> s2) {
		Set unionSet = new HashSet<>(s1);
		unionSet.addAll(s2);
		 return unionSet;	
	} 
	    
	public static Set<?> intersect (Set <?> s1, Set <?> s2) {
		Set<?>  intersectSet = new HashSet<>(s1);
		intersectSet.retainAll(s2);
		 return intersectSet;	
	} 
	  

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>( );
		Set<String> set2 = new HashSet<>( );
		
		
		{set1.add("Garry Kasparow");		
		set1.add("Ardrii Duda");
		set1.add("Leonid Kadeniuk");
		set1.add("Stepan Giga");
		set1.add("Erih Remark");
		set1.add("Serhiy Prytula");
		set1.add("Misha Lonyk");
		
		set2.add("Garry Kasparow");
		set2.add("Ardrii Duda");
		set2.add("Leonid Kadeniuk");
		set2.add("aaaaaaa");
		set2.add("bbbbbbb");
		set2.add("ccccccc");
		set2.add("ddddddd");
		}
//		Set<String> unionSet = new HashSet<>(set1);
//		{unionSet.addAll(set2);}
//
//
//		Set<String> intersectSet = new HashSet<>(set1);
//		{intersectSet.retainAll(set2);}
//
//	
//		System.out.println("intersectSet =	 " + intersectSet);
		//System.out.println("unionSet =" + unionSet	);
	
		System.out.println(union(set1, set2 ));
		System.out.println(intersect(set1, set2));
	}
}
