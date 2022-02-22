package com.softserve.edu.hwOOP1;


public class Appl4 {
    public static void main(String[] args) {
    	Employee employee1 = new Employee("Taras", 28, 28580.50);
        Employee employee2 = new Developer("Bohdan", 35, 32673.40);
        System.out.println(employee1.report());
        System.out.println(employee2.report());
   
                }
    }
