package com.software.edu.hw13.homeWork2;

import com.software.edu.hw13.homeWork1.FirstThread;
import com.software.edu.hw13.homeWork1.SecondThread;

public class Runner {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] args) {
        Runnable r1 = new FirstThread();
        Thread t1= new Thread(r1);

        Runnable r2 = new SecondThread();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}