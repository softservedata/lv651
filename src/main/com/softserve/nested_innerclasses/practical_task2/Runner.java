package com.softserve.nested_innerclasses.practical_task2;

public class Runner {
    public static void main(String[] args) {
        ShapeWrapper<Square> squareWrapper = new ShapeWrapper<>(new Square());
        System.out.println(squareWrapper.getArea());
        ShapeWrapper<Circle> circleWrapper = new ShapeWrapper<>(new Circle());
        System.out.println(circleWrapper.getArea());
//        Following code gives compile error
//        ShapeWrapper<String> stringWrapper = new ShapeWrapper<>("Hello!");
    }
}
