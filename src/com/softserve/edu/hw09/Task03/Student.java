package com.softserve.edu.hw09.Task03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Comparator;


public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(int course, String name) {
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

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents(LinkedList<Student> list, int i){
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            if(student.getCourse() == course)
                System.out.print(student);
        }
    }

    public static class byCourse implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2){
            return st1.getCourse() - st2.getCourse();
        }
    }
    public static class byName implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
