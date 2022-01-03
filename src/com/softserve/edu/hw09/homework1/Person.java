package com.software.edu.hw09.homework1;

public abstract class Person  extends FullName{
    FullName fullName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public Person(FullName fullName, int age) {
        super();
        this.fullName = fullName;
        this.age = age;
    }
    public String  info(){
        return "Last name: " + lastName +
                "\nFirst name: " + firstName +
                "\nAge: " + age;
    }

    public abstract String activity();
}
