package com.software.edu.hw09.practicalTask2;
import static java.lang.Math.PI;

public class Square implements Shape{
    private int radius = 10;
    private double s;

    @Override
    public double getArea() {
        return s = PI *(radius * radius) ;
    }

    @Override
    public String toString() {
        return "/Square area is: .2f%"+ s ;
    }
}
