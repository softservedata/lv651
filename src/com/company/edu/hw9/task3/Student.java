package com.company.edu.hw9.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Student implements Comparable<Student>{
    private int course;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }
    public static void printStudents (LinkedList <Student> list, Integer course){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Student obj = (Student) iterator.next();
                if(obj.course==course && course>0 && course<6) {
                    System.out.println(obj);

                }
                else if(course<=0 || course>5 ){
                    System.out.println("This course doesnt have students\n");
                    break;
                }
        }
        System.out.println("\n");
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student std1, Student std2) {
            return std1.getName().compareTo(std2.getName());
        }
    }
    public static class CompareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse()- st2.getCourse();
        }
    }
}
