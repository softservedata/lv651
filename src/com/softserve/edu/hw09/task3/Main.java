package com.softserve.edu.hw09.task3;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

            LinkedList<Student> list = new LinkedList<>();
            list.add(new Student(2,"Alex"));
            list.add(new Student(2,"Bob"));
            list.add(new Student(3, "Nestor"));
            list.add(new Student(4, "Ivan"));
            list.add(new Student(2,"Oleg"));
        System.out.println("\nStudents taught in 2 course: ");
            list.get(0).printStudents(list,2 );
        System.out.println("\n\nStudents sorted by name: ");
        Collections.sort(list, new Student.byName());
        System.out.println(list);
        System.out.println("\nStudents sorted by course: ");
        Collections.sort(list, new Student.byCourse());
        System.out.println(list);

    }
}
