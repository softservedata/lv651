package com.softserve.edu.hw09.set;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	
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
	Set<String> unionSet = new HashSet<>(set1);
	{unionSet.addAll(set2);}


	Set<String> intersectSet = new HashSet<>(set1);
	{intersectSet.retainAll(set2);}

}
