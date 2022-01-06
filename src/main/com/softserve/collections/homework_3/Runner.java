package com.softserve.collections.homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 1));
        students.add(new Student("Yura", 2));
        students.add(new Student("Danya", 1));
        students.add(new Student("Olya", 3));
        students.add(new Student("Valya", 4));

        System.out.println("List of students:" + students);
        System.out.println("\nStudents sorted by name: ");
        Collections.sort(students, new SortByName());
//        System.out.println("\nStudents sorted by course: ");
//        Collections.sort(students, new SortByCourse());

        for (Student student : students) {
            System.out.println("Student name: " + student.getName()
                    + ". Course:  " + student.getCourse() + ".");
        }

        System.out.println("\nPrint student with a certain course: ");
        Student.printStudents(students, 1);
        System.out.println("\nPrint student with a certain course: ");
        Student.printStudents(students, 2);
        System.out.println("\nPrint student with a certain course: ");
        Student.printStudents(students, 3);
        System.out.println("\nPrint student with a certain course: ");
        Student.printStudents(students, 4);
    }
}
