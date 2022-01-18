package com.software.edu.hw10.homeWork3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

    public static class ByName implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2){
            return st1.getName().compareTo(st2.getName());
        }

    }

    public static class byCourse implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2){
            return  st1.getCourse()- st2.getCourse();
        }

    }

    //---------------------

    private String name;
    public int course;

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

    public static void printStudent(List <Student> students, Integer course){
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            Student std = itr.next();
            if(std.course == course){
                System.out.println("Student name: "+ std.getName()+". Course: "+std.getCourse());

            }
        }
    }



    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", course=" + course +
                ']';
    }


    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}
