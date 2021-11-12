package com.softserve.edu01;

public class Appl {
    private int i = 123;

    public void superMethod() {
        System.out.println("m1(), i = " + i);
    }

    /**
     * The <font color='red'>Main <b>Method</p></font>
     * @param args Argument from command line.
     */
    public static void main(String[] args) {
        /* This is a sample class which is used to demonstrate
         * the use of multi-line comments. This comment does not appear in the
         * java documentation
         */
        System.out.println("Hel-\nlo");
        //
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        //
        Appl app = new Appl();
        System.out.println("app.i= " + app.i);
        Appl app2 = new Appl();
        app2.i = 456;
        System.out.println("app.i= " + app.i);
        System.out.println("app2.i= " + app2.i);
        //
        app.superMethod();
        app2.superMethod();
        //
        int k = 65;
        System.out.println("k = " + k + " (char)k = " + (char) k);
    }
}
