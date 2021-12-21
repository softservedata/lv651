package com.lect8.inner.homework.one;

public class Student extends Person {
    int courseOfStudy;

    public Student(Person person, int courseOfStudy) {
        /*       super(1,"AAA", "BBB");*/
        person = new Person() {
            @Override
            public String activity() {
                return null;
            }
        };
        this.courseOfStudy = courseOfStudy;
    }

    @Override
    public String info() {
        return super.info()+"\nCourse of Study: "+courseOfStudy;
    }

    @Override
    public String activity() {
        return "Я навчаюся в університеті";
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName=" + fullName +
                ", courseOfStudy=" + courseOfStudy +
                '}';
    }
}

