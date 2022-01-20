package com.softserve.edu.hw08.Task01;

public class Main {
    public static void main(String[] args) {
        FullName st1= new FullName("Volodymyr","Hordeichuk");
        FullName st2 = new FullName("Nestor", "Trush");
        Student student1= new Student(st1, 19,3);
        Student student2= new Student(st2, 18,2);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println("Student Volodymyr:");
        System.out.println(student1.activity());
        System.out.println("Student Nestor:");
        System.out.println(student2.activity());
    }
}
