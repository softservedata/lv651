package com.softserve.nested_innerclasses.homework1;

public class Runner {
    public static void main(String[] args) {
        Student stud1 = new Student("Olya", "Mitroshina", 18, 1);
        Student stud2 = new Student("Gosha","Grishin",24,5);
        System.out.println(stud1.activity());
        System.out.println(stud1.info());
        System.out.println(stud2.activity());
        System.out.println(stud2.info());
    }
}
