package com.softserve.edu.hw09.task1;

import com.softserve.edu.hw09.task3.Student;

import java.util.Set;

public class SetHelper {
   public Set <String> union (Set <String> set1, Set <String> set2){
       set1.addAll(set2);
       return set1;
   }

   public Set <String> intersect (Set <String> set1, Set <String> set2){
      set1.retainAll(set2);
      return set1;
   }

}
