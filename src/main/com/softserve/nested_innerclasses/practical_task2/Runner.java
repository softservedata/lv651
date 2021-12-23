package com.softserve.nested_innerclasses.practical_task2;

public class Runner {
    public static void main(String[] args) {
        ShapeWrapper<Square> squareWrapper = new ShapeWrapper<>(new Square());

//        Following code gives compile error
//        ShapeWrapper<String> stringWrapper = new ShapeWrapper<>("Hello!");
    }
}
