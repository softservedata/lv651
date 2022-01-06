package com.softserve.collections.homework_3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student std = itr.next();
            if (std.course == course) {
                System.out.println("Student name: " + std.getName()
                        + ". Course:  " + std.getCourse() + ".");
            }
        }

        //for each loop
//        for(Student student : students) {
//            if(student.course == course){
//                System.out.println(student.getName() + " " + student.getCourse());
//            }
//        }

    }

    @Override
    public String toString() {
        return "Name : " + name + ". Course: " + course;
    }

}



