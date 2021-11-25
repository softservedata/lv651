package com.softserve.edu07inher;

public class Appl {
    public static void main(String[] args) {
        /*-
        B b = new B();
        System.out.println("i = " + b.getI());
        */
        /*-
        int i = 1234;
        double d = i;
        System.out.println("i = " + i + "  d = " + d);
        //
        d = 234.51;
        // i = d; // Compile Error
        i = (int) d; // Code Smell;
        System.out.println("i = " + i + "  d = " + d);
        */
        /*-
        A a = new A(14);
        System.out.println("i = " + a.getI());
        B b = new B();
        //
        // b = a; // Compile Error
        //b = (B) a; // Runtime Error; Code Smell;
        a = b;
        System.out.println("i = " + a.getI());
        // System.out.println("j = " + a.j); // Compile Error
        System.out.println("j = " + ((B) a).j); // Code Smell;
        */
        // /*-
        A a = new B();
        System.out.println("i = " + a.getI()); // 12
        if (a instanceof B) {
            System.out.println("j = " + ((B) a).j);
        }
        a.m(); // Code Smell; running from A;
        A.m();
        B.m();
        // */
    }
}
