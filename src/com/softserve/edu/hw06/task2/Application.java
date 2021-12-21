package com.softserve.edu.hw06.task2;

public class Application {
    public static void main(String[] args) {
        Developer seniorDev = new Developer("Mykola",30, 5000,"senior");
        System.out.println(seniorDev.report());

        Employee taxiDriver = new Employee("Taras",45,3000);
        System.out.println(taxiDriver.report());

    }
}
