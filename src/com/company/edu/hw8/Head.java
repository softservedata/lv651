package com.company.edu.hw8;

public class Head {
    public static void main(String[] args) {
        FullName name1 = new FullName("Oleg", "Fedyshyn");
        FullName name2 = new FullName("Nestor", "Trush");

Student st1=new Student(name1, 18, 2);
Student st2=new Student(name2, 19,  3);
        System.out.println(st1.info());
        System.out.println(st1.activity());
        System.out.println(st2.info());
        System.out.println(st2.activity());

    }
}
