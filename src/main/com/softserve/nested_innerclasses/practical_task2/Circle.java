package com.softserve.nested_innerclasses.practical_task2;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private double side = 5;
    private double s;

    @Override
    public double getArea() {
        return s = side * side;
    }

    @Override
    public String toString() {
        return "\nCircle area is: " + s ;
    }
}
