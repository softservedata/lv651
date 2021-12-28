package com.softserve.edu.homework7.task2;

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> INT = new Wrapper<>(28);
        Wrapper<String> str = new Wrapper<>("Hello World!");
        Wrapper<Boolean> boo = new Wrapper<>(true);

        System.out.println("Wrapper<Integer> INT: " + INT.getValue());
        System.out.println("Wrapper<String> str: " + str.getValue());
        System.out.println("Wrapper<Boolean> boo: " + boo.getValue());
    }
}
