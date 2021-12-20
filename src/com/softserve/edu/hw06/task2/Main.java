package com.softserve.edu.hw06.task2;

public class Main {
    public static void main(String args []){
        Employee employee = new Employee("Nestor", 18, 10000);
        Developer developer = new Developer("Nestor", 18, 10000,"Java Dev");
        System.out.println("Employee info: " + employee.report());
        System.out.println("Dev info: " + developer.report());
    }
}
