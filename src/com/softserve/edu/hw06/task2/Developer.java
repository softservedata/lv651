package com.softserve.edu.hw06.task2;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public Developer(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return "name:" + this.name + ", age:" + this.age +  ", salary:" + this.salary + ", position:" + position;
    }

    public Developer() {
        super();
    }
}
