package com.software.edu.hw09.practicalTask2;

public class WrapperShape <T extends Shape> {
    private T t;

    public WrapperShape(T t) {
        this.t = t;
    }

    double getArea(){
        return t.getArea();
    }
}
