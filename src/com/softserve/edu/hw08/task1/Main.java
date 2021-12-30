package com.softserve.edu.hw08.task1;

public class Main {
    public static void main(String[] args) {
        FullName st1= new FullName("Nestor","Trush");
        FullName st2 = new FullName("Oleg", "Fedyshyn");
        Student student1= new Student(st1, 18,2);
        Student student2= new Student(st2, 19,2);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println("Student Nestor:");
        System.out.println(student1.activity());
        System.out.println("Student Oleg:");
        System.out.println(student2.activity());
    }
}
