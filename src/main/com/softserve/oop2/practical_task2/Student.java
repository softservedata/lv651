package com.softserve.oop2.practical_task2;

public class Student extends Person {
    public String name;
    public int age;
    final String TYPE_PERSON;

    public Student(String name, int age, String typePerson) {
        this.name = name;
        this.age = age;
        TYPE_PERSON = typePerson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("My name is " + getName() + ", I am a " + getTypePerson() + ", I am " + getAge() + " years old.");
    }
}
