package com.software.edu.hw08.practicaltask2;

public class Student extends Person{
    private String name;
    private int age;
    final String TYPE_PERSON;

    public Student(String name, int age, String TYPE_PERSON) {
        this.name = name;
        this.age = age;
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print(){
        System.out.println("My name is " + getName() + ", I am a " + getTYPE_PERSON() + ", I am " + getAge() + " years old.");
    }
}
