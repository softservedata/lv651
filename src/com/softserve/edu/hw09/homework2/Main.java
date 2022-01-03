package com.software.edu.hw09.homework2;

public class Main {
    public static void main(String[] args) {
        Wrapper<String> str = new Wrapper<>("Hello");
        Wrapper<Integer> num = new Wrapper<>(132);
        Wrapper<Boolean> bool = new Wrapper<>(true);

        System.out.println(str.getValue());
        System.out.println(bool.getValue());
        System.out.println(num.getValue());

    }
}
