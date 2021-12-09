package com.softserve.lesson4;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static int totalSum;


    public Employee() {

    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return rate * 0.1;
    }

    public void changeRate(int rate) {
        this.rate += rate;
    }

    public String toString() {
        return "Name: " + name + "\nRate: " + rate + "\nWorking hours: " + hours;
    }

}
