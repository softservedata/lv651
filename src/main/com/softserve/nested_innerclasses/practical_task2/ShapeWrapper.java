package com.softserve.nested_innerclasses.practical_task2;

public class ShapeWrapper<T extends Shape> {
    private T t;

    public ShapeWrapper(T t) {
        this.t = t;
    }

  double getArea(){
        return t.getArea();
  }

}
