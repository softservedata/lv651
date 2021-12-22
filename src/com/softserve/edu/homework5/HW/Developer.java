package com.softserve.edu.homework5.HW;

public class Developer extends Employee{

    private String position;

    public Developer() {
        super();
        this.position = "";
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        String s = "Name: " + super.getName() + ", Age: " + super.getAge() + " years, Position: " + position + ", Salary: " + super.getSalary();
        return s;
    }
}
