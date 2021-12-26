package com.softserve.edu.hw08.task1;

public class Student extends Person {
    private int course;

    public Student(int course, FullName fullName, int age) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        if (this instanceof Person) {
            return "I study at university";
        } else return null;
    }

        @Override
        public String info() {
            return super.info() + " course: " + course;

        }
    }



