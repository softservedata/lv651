package com.softserve.edu.hw08.Task02;

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> wrapper1 = new Wrapper<>();
        wrapper1.setValue(1);
        Wrapper<String> wrapper2 = new Wrapper<>();
        wrapper2.setValue("A");
        Wrapper<Boolean> wrapper3 = new Wrapper<>();
        wrapper3.setValue(true);
        System.out.println(wrapper1.getValue());
        System.out.println(wrapper2.getValue());
        System.out.println(wrapper3.getValue());
    }
}
