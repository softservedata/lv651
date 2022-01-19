
package com.softserve.edu.hw09.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	
	public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()){
        	Student current = iter.next();
        	if (current.getCourse() == course)
            System.out.println("Name:	" + current.getName() + "	Course:	" + current.getCourse());
        }
    }
	
	public static void printAllStudents(List<Student> studentsList) {
		for (Student student: studentsList)   {
        System.out.println(student);
	    }
	
	}
	public static void main(String[] args) {
	
		List <Student> list = new ArrayList<Student>();
			list.add(new Student("Jonny	", 	3));
			list.add(new Student("Garry	", 	2));
			list.add(new Student("Padra	", 	1));
			list.add(new Student("Nigga	", 	2));
			list.add(new Student("Denys	", 	5));
			list.add(new Student("Velera	", 	4));
			list.add(new Student("Murko	",   1));
			list.add(new Student("Adik	", 	2));
			
			printAllStudents(list);
			printStudents(list, 2);

			
			Collections.sort(list,  new Student.ByName());		
			printAllStudents(list);
			
			System.out.println();
		
			Collections.sort(list,  new Student.ByCourse());
			printAllStudents(list);
			
			System.out.println();
			
			Collections.sort(list,  new Student.ByNameAndCourse());
			printAllStudents(list);
	}		

	

}
