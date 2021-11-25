package com.softserve.edu07inher;

public class B extends A {
    public int j = 321; // Achitecture (Encapsulation) Error

    public B() {
        //super(14);
        // super();
        System.out.println("constructor B()");
    }

    public B(int j) {
        // super();
        //super(14);
        this.j = j;
        System.out.println("constructor B(int j)");
    }

    @Override
    public int getI() {  // Runtime Polymorphism
        System.out.println("\tgetI() from B");
        return super.getI();
        //return j;
    }

    public int work() {
        System.out.println("\twork() from B");
        return super.getI();
    }
    
    public static void m() {
        System.out.println("\tstatic m() from B");
    }

}