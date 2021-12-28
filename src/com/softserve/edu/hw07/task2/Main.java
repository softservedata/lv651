package com.softserve.edu.hw07.task2;

public class Main {
    public static void main(String args []){
        Employee employee = new Employee("Volodymyr ", 19, 10000 );
        Developer developer = new Developer("Nestor ", 18 , 3000 ,"Java Developer ");
        System.out.println("Employee info: " + employee.report());
        System.out.println("Dev info: " + developer.report());
    }
}
