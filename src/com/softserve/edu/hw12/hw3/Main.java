package com.softserve.edu.hw12.hw3;

public class Main {
    public static void main(String[] args) {

        Thread t1  = new Thread() {
            public void run(){
                System.out.println("Start thread #1");
                Thread t2 = new Thread(){
                    public void run(){
                        for (int i = 0; i<3; i++)
                            System.out.println("Thread number two");
                        Thread t3 = new Thread(() -> {
                            for (int i = 0; i < 5; i++)
                                System.out.println("Thread number three");
                        });
                        t3.start();
                    }
                };
                t2.start();
            }
        };
        t1.start();
    }
}
