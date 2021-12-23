package com.softserve.nested_innerclasses.homework2;

public class Runner {
    public static void main(String[] args) {

        Wrapper<Integer> num = new Wrapper<>(10);
        Wrapper<Boolean> bool = new Wrapper<>(true);
        Wrapper<String> str = new Wrapper<>("Hello");

        System.out.println(num.getValue());
        System.out.println(bool.getValue());
        System.out.println(str.getValue());

    }
}
