package com.softserve.nested_innerclasses.homework1;

public abstract class Person extends Fullname {
    Fullname fullName;
    int age;

    public Person(Fullname fullName, int age) {
        super();
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public String info() {
        return "Last name: " + lastName +
                "\nFirst name: " + firstName +
                "\nAge: " + age;
    }

    public abstract String activity();
}
