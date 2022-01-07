package com.company.edu.hw8.task2;


public class Head {
    public static void main(String[] args) {
        Wrapper<Integer> obj1=new Wrapper<>(2);
        Wrapper<String> obj2=new Wrapper<>("34");
        Wrapper<Boolean> obj3=new Wrapper<>(true);

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj3.getValue());

    }
}
