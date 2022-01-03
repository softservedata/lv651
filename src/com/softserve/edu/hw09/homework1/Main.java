package com.software.edu.hw09.homework1;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Vlad", "Hryshko", 18, 2);
        Student stud2 = new Student("Ira","Oleksuk",19,2);
        Student stud3 = new Student("Ivan","Ivanov",20,3);
        System.out.println(stud1.activity()+"\n"+stud1.info());
        System.out.println(stud2.activity()+"\n"+stud2.info());
        System.out.println(stud3.activity()+"\n"+stud3.info());

    }
}
