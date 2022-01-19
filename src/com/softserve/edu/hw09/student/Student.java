package com.softserve.edu.hw09.student;

import java.util.Comparator;


public class Student implements Comparable<Student> {
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

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }

    @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.getName());
    }


    static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    static class ByNameAndCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getCourse() != s2.getCourse())
                return s1.getCourse() - s2.getCourse();

            else
                return s1.getName().compareTo(s2.getName());

        }
    }

    static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }

    }

}
