package com.software.edu.hw10.homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Vlad",1));
        students.add(new Student("Anna",2));
        students.add(new Student("Vova",3));
        students.add(new Student("Orest",2));
        students.add(new Student("Ira",1));
        System.out.println("ArrayList: "+ students);


        System.out.println("\nStudents sorted by name: ");
        Collections.sort(students,new Student.ByName());

//        System.out.println("\nStudents sorted by course: ");
//        Collections.sort(students, new Student.byCourse() );

        for (Student student : students) {
            System.out.println("Student name: " + student.getName()
                    + ". Course:  " + student.getCourse() + ".");
        }

        System.out.println("\nPrint student with a certain course: ");
        Student.printStudent(students, 1);
        System.out.println("\nPrint student with a certain course: ");
        Student.printStudent(students, 2);
        System.out.println("\nPrint student with a certain course: ");
        Student.printStudent(students, 3);

    }
}
