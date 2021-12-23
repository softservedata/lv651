package com.softserve.nested_innerclasses.homework1;

public class Student extends Person {
    int course;

    public Student(Fullname fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I am a student";
    }

    @Override
    public String info() {
        return "Student: " +
                "\nLast name: " + lastName +
                "\nFirst name: " + firstName +
                "\nAge: " + age +
                "\nCourse#: " + course;
    }
}
