package com.software.edu.hw09.homework1;

public class Student extends Person {
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }


    @Override
    public  String activity(){
    return "Hello, I'm a student and I study at university";

    }
    @Override
    public String info() {
        return "Student[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course= " + course +
                ']';
    }
}
