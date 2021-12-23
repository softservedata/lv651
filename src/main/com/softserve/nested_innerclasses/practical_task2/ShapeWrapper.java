package com.softserve.nested_innerclasses.practical_task2;

public class ShapeWrapper<T extends Shape> {
    private T t;

    public ShapeWrapper(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
