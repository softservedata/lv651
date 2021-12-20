package com.company.edu.hw6.task2;

import javax.print.attribute.standard.MediaSize;

public class Head {
    public static void main(String[] args) {

        Developer dev1=new Developer("Oleg", 19, 345.19f, "Engineer");
        Employee emp1=new Employee("Nestor", 18, 201.34f);
        System.out.println(emp1.report());
        System.out.println(dev1.report());
    }
}
