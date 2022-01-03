package com.software.edu.hw09.practicalTask2;

public class Main {
    public static void main(String[] args) {
        WrapperShape<Circle> circleWrapper = new WrapperShape<>(new Circle());
        System.out.println(circleWrapper.getArea());
        WrapperShape<Square> squareWrapper = new WrapperShape<>(new Square());
        System.out.println(squareWrapper.getArea());
    }
}
