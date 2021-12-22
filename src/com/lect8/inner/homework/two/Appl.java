package com.lect8.inner.homework.two;

public class Appl {
    public static void main(String[] args) {
        Wrapper<String> s1 = new Wrapper<>();
        s1.setValue("String.");
        Wrapper<Integer> i1 = new Wrapper<>();
        i1.setValue(13);
        Wrapper<Object> b = new Wrapper<>();
        b.setValue(true);
        System.out.println(s1.getValue());
        System.out.println(i1.getValue());
        System.out.println(b.getValue());
    }
}
