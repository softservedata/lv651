package com.softserve.edu.hw09.task3;
import org.w3c.dom.ls.LSOutput;
import java.util.Iterator;
import java.util.List;

public class Student {
   private String name;
   private   int course;

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List <Student> list, int course){
        Iterator <Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }





}


