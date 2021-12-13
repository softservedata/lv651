package com.softserve.oop2.practical_task2;

public class Cleaner extends Staff {
    public String name;
    public int salary;
    final String TYPE_PERSON;

    public Cleaner(String name, int salary, String typePerson) {
        this.name = name;
        this.salary = salary;
        TYPE_PERSON = typePerson;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("My name is " + getName() + " and i'm working as a " + getTypePerson());
    }

    @Override
    public void salary() {
        System.out.println("My salary is " + getSalary() + "$.");
    }
}
