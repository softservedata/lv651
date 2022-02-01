package com.software.edu.hw13.homeWork3;

public class OneThread {
    public static void main (String[]args){
        Runnable r1 = new TwoThread();
        Thread t1 = new Thread(r1);

        t1.start();
    }

}
