package com.software.edu.hw08.practicaltask2;

public class Cleaner extends Staff{
    private String name;
    private int salary;
    final String TYPE_PERSON;

    public Cleaner(String name, int salary, String TYPE_PERSON) {
        this.name = name;
        this.salary = salary;
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
    @Override
    public void print(){
        System.out.println("My name is " + getName() + ", I am a " + getTYPE_PERSON() + ", I am " + getSalary() + " years old.");
    }

    @Override
    public void salary() {
        System.out.println("My salary is " + getSalary() + "$.");
    }
}
