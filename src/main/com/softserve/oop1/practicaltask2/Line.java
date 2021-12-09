package com.softserve.oop1.practicaltask2;

public class Line {
    private Point a = new Point(4,6);
    private Point b = new Point(5,8);

    @Override
    public  String toString() {
        return "Object Point " +
                "a.X = " + a.getX() +
                ", a.Y = " + a.getY() +
                ", b.X = " + b.getX() +
                ", b.Y = " + b.getY() +
                '.';
    }

    public void print() {
        System.out.println("The Lines: " + toString());
    }
}
