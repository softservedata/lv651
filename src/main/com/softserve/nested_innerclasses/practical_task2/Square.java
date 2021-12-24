package com.softserve.nested_innerclasses.practical_task2;

import static java.lang.Math.PI;

public class Square implements Shape {
    private double radius = 4;
    private double s;

    @Override
    public double getArea() {
        return s = PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "\nSquare are is: " + s;
    }
}
