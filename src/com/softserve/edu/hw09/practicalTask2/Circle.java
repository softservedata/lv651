package com.software.edu.hw09.practicalTask2;

public class Circle implements Shape{
    private int side = 7;
    private double s;


    @Override
    public double getArea() {
        return s = side * side;
    }

    @Override
    public String toString() {
        return "Circle area is "+ s;
    }
}
