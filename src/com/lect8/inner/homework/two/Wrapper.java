package com.lect8.inner.homework.two;

public class Wrapper<T> {
    private T value;

    public Wrapper() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "value=" + value +
                '}';
    }
}
