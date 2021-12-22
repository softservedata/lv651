package com.softserve.edu.homework5.HW;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        String s = "Name: " + name + ", Age: " + age + " years, Salary: " + salary;
        return s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee taras = new Employee("Taras", 26, 27500.200);
        Employee olga = new Developer("Olga", 24, 35500.500, "JAVA Developer");

        System.out.println(taras.report());
        System.out.println(olga.report());
    }
}
