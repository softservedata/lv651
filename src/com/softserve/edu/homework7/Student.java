package com.softserve.edu.homework7;

public class Student extends Person{
    int course;

    public Student(Person person, int course) {
        person = new Person() {
            @Override
            public String activity() {
                return null;
            }
        };
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName=" + fullName +
                ", course=" + course +
                '}';
    }
}
