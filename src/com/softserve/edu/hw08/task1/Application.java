package com.softserve.edu.hw08.task1;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student(3,new FullName("Ivan ", " Ihorovych "), 19);
        Student student2 = new Student(5, new FullName("Petro ", " Romanovych "), 21);
        System.out.println("student1 info: " + student1.info()+ " " + student1.activity());
        System.out.println("student2 info: " + student2.info()+ " " + student2.activity());
    }
}
