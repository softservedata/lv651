package com.company.edu.hw6.task1;

public class Head {
    public static void main(String[] args) {
        Chicken bird1=new Chicken("Average", true);
        Eagle bird2=new Eagle("Big", true);
        Swallow bird3 = new Swallow("Small", true);
        Penguin bird4 = new Penguin("Only for swimming", true);
        Bird[] bird={bird1, bird2, bird3, bird4};
        for (Bird value : bird) {
            System.out.println(value.toString());
            System.out.println("Can this bird fly?" + value.Fly());
        }
    }
}
