package com.software.edu.hw13.practicalTask2;

public class Runner {
    public static void main(String[] args) {

    Runnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();
}
}
